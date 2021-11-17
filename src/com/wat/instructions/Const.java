package com.wat.instructions;

public class Const implements Instruction{
    public final WasmType type;
    public static final String postfix = ".const";
    public final int constant;
    public String getCode() {
        return type.toString()+postfix;
    }
    public Const(WasmType tp, int value)
    {
        this.type = tp;
        this.constant = value;
    }
}
