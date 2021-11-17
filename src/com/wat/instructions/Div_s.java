package com.wat.instructions;

public class Div_s implements Instruction{
    public final WasmType type;
    public static final String postfix = ".div_s";
    public String getCode() {
        return type.toString()+postfix;
    }
    public Div_s(WasmType tp)
    {
        this.type = tp;
    }
}
