package com.wat.instructions;

public class CountLeadingZeros implements Instruction
{
    public final WasmType type;
    public static final String postfix = ".clz";
    public String getCode() {
        return type.toString()+postfix;
    }
    public CountLeadingZeros(WasmType tp)
    {
        this.type = tp;
    }
}
