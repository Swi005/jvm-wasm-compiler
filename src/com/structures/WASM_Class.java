package com.structures;

import com.jvm.instruction.WasmType;
import com.jvm.instruction.utilInsn.MallocWrapper;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class WASM_Class
{
    public List<WASM_Method> methods;
    public String className;
    public LinkedHashMap<String, WasmType> fields;
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

    public List<WASM_Method> generateFieldAccess()
    {
        List<WASM_Method> fieldAccess = new ArrayList<>();
        for (String str: fields.keySet()) {
            WASM_Method m = new WASM_Method();
            m.name = str.
        }
        return null;
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
