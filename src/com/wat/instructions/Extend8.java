package com.wat.instructions;

public class Extend8 implements Instruction {
    public final WasmType type;
    public static final String postfix = ".extend8_s";
    public String getCode() {
        return type.toString()+postfix;
    }
    public Extend8(WasmType tp)
    {
        this.type = tp;
    }
}
