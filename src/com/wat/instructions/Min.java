package com.wat.instructions;

public class Min implements Instruction{
    public final WasmType type;
    public static final String postfix = ".min";
    public String getCode() {
        return type.toString()+postfix;
    }
    public Min(WasmType tp)
    {
        this.type = tp;
    }
}
