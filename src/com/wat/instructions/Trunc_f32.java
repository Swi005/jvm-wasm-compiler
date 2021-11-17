package com.wat.instructions;

public class Trunc_f32 implements Instruction {
    public final WasmType type;
    public final boolean isSigned;
    public static final String postfix = ".trunc_f32";
    public String getCode() {
        return type.toString()+postfix;
    }
    public Trunc_f32(WasmType tp,boolean isSigned)
    {
        this.isSigned = isSigned;
        this.type = tp;
    }
}
