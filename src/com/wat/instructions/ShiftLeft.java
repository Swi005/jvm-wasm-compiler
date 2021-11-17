package com.wat.instructions;

public class ShiftLeft implements Instruction{
    public final WasmType type;
    public static final String postfix = ".shl";
    public String getCode() {
        return type.toString()+postfix;
    }
    public ShiftLeft(WasmType tp)
    {
        this.type = tp;
    }
}
