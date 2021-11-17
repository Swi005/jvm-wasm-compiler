package com.wat.instructions;

public class Sqrt implements Instruction{
    public final WasmType type;
    public static final String postfix = ".sqrt";
    public String getCode() {
        return type.toString()+postfix;
    }
    public Sqrt(WasmType tp)
    {
        this.type = tp;
    }
}
