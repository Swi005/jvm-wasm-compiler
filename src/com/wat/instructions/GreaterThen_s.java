package com.wat.instructions;

public class GreaterThen_s implements Instruction {
    public final WasmType type;
    public static final String postfix = ".gt_s";
    public String getCode() {
        return type.toString()+postfix;
    }
    public GreaterThen_s(WasmType tp)
    {
        this.type = tp;
    }
}
