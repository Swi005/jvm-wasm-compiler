package com.wat.instructions;

public class Nearest implements Instruction{
    public final WasmType type;
    public static final String postfix = ".nearest";
    public String getCode() {
        return type.toString()+postfix;
    }
    public Nearest(WasmType tp)
    {
        this.type = tp;
    }
}
