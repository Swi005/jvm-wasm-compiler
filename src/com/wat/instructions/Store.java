package com.wat.instructions;

public class Store implements Instruction{
    public final WasmType type;
    public static final String postfix = ".store";
    public String getCode() {
        return type.toString()+postfix;
    }
    public Store(WasmType tp)
    {
        this.type = tp;
    }
}
