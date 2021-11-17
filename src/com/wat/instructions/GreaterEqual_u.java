package com.wat.instructions;

public class GreaterEqual_u implements Instruction {
    public final WasmType type;
    public static final String postfix = ".ge_u";
    public String getCode() {
        return type.toString()+postfix;
    }
    public GreaterEqual_u(WasmType tp)
    {
        this.type = tp;
    }
}
