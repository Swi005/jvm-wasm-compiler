package com.structures;

import com.jvm.instruction.WasmType;
import com.jvm.instruction.utilInsn.MallocWrapper;
import com.jvm.instruction.utilInsn.READ;
import com.jvm.instruction.utilInsn.WRITE;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class WASM_Class
{
    public List<WASM_Method> methods = new ArrayList<>();
    public String className;
    public LinkedHashMap<String, WasmType> fields = new LinkedHashMap<>();
    public boolean isStatic = false;

    public int calculateOffset(String key)
    {
        int offset = 4;
        for (String key2 : fields.keySet()) {
            if(key2.equals(key))
                return offset;
            else
                offset += fields.get(key2).getSize();
        }
        throw new IllegalStateException();
    }

    /**
     * Calculates the total size of the partition
     * @return
     */
    public int calculatePartitionSize()
    {
        int c = 4;//Should be equal to the header size
        for (WasmType t: fields.values())
            c+=t.getSize();
        return c;
    }

    public void generateFieldAccess()
    {
        //GENERATE GETTERS AND SETTERS FOR ALL FIELDS
        for (String str: fields.keySet()) {
            //GETTER
            WASM_Method get = new WASM_Method();
            get.isPublic = true;
            get.name = className+"_get_"+str;
            get.params.add(WasmType.i32);
            get.returnType = fields.get(str);
            get.instructions.add(new READ("local.get 0",get.returnType));
            methods.add(get);

            //SETTER
            WASM_Method set = new WASM_Method();
            set.name = className+"_set_"+str;
            get.isPublic = true;
            set.params.add(WasmType.i32);
            set.params.add( fields.get(str));
            set.instructions.add(new WRITE("local.get 0", fields.get(str),"local.get 1"));
            methods.add(get);
        }
    }
    public WASM_Method generateConstructor()
    {
        for (WASM_Method method: methods) {
            if(method.name.contains("init"))
            {
                method.instructions.add(0, new MallocWrapper(this.calculatePartitionSize(), false));
                return method;
            }
        }
        return null;
    }

}
