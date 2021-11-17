package com.wat.instructions;

public class POPCNT implements Instruction
{
    public final WasmType type;
    public static final String postfix = ".popcnt";
    public String getCode() {
        return type.toString()+postfix;
    }
    public POPCNT(WasmType tp)
    {
        this.type = tp;
    }
}
