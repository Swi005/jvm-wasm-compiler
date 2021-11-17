package com.wat.instructions;

public class LessEqual_u implements Instruction{
    public final WasmType type;
    public static final String postfix = ".le_u";
    public String getCode() {
        return type.toString()+postfix;
    }
    public LessEqual_u(WasmType tp)
    {
        this.type = tp;
    }
}
