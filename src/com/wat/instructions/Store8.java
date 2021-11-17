package com.wat.instructions;

public class Store8 {
    public final WasmType type;
    public static final String postfix = ".store8";
    public String getCode() {
        return type.toString()+postfix;
    }
    public Store8(WasmType tp)
    {
        this.type = tp;
    }
}
