package com.structures;

import com.jvm.instruction.WasmType;

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
        int offset = 0;
        for (String key2 : fields.keySet()) {
            if(key2.equals(key))
                return offset;
            else
                offset += fields.get(key2).getSize();
        }
        throw new IllegalStateException();
    }
}
