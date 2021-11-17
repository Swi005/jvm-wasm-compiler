package com.wat.instructions;

public class CountTrailingZeros implements Instruction{
    public final WasmType type;
    public static final String postfix = ".ctz";
    public String getCode() {
        return type.toString()+postfix;
    }
    public CountTrailingZeros(WasmType tp)
    {
        this.type = tp;
    }
}
