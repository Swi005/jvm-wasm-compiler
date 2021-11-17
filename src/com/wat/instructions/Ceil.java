package com.wat.instructions;

public class Ceil implements Instruction {
    public final WasmType type;
    public static final String postfix = ".ceil";
    public String getCode() {
        return type.toString()+postfix;
    }
    public Ceil(WasmType tp)
    {
        this.type = tp;
    }
}
