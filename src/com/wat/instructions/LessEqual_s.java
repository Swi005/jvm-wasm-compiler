package com.wat.instructions;

public class LessEqual_s implements Instruction {
    public final WasmType type;
    public static final String postfix = ".le_s";
    public String getCode() {
        return type.toString()+postfix;
    }
    public LessEqual_s(WasmType tp)
    {
        this.type = tp;
    }
}
