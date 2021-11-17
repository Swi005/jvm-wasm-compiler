package com.wat.instructions;

public class Abs implements Instruction {
    public final WasmType type;
    public static final String postfix = ".abs";
    public String getCode() {
        return type.toString()+postfix;
    }
    public Abs(WasmType tp)
    {
        this.type = tp;
    }
}
