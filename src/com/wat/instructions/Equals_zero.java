package com.wat.instructions;

public class Equals_zero implements Instruction{
    public final WasmType type;
    public static final String postfix = ".eqz";
    public String getCode() {
        return type.toString()+postfix;
    }
    public Equals_zero(WasmType tp)
    {
        this.type = tp;
    }
}
