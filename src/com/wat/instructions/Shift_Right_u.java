package com.wat.instructions;

public class Shift_Right_u implements Instruction {
    public final WasmType type;
    public static final String postfix = ".shr_u";
    public String getCode() {
        return type.toString()+postfix;
    }
    public Shift_Right_u(WasmType tp)
    {
        this.type = tp;
    }
}
