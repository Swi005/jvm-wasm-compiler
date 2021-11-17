package com.wat.instructions;

public class Load8 implements Instruction {
    public final WasmType type;
    public static final String postfix = ".load8";
    public String getCode() {
        return type.toString()+postfix;
    }
    public Load8(WasmType tp)
    {
        this.type = tp;
    }
}
