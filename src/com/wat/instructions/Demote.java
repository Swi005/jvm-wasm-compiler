package com.wat.instructions;

public class Demote implements Instruction{
    public final WasmType type;
    public static final String postfix = ".demote_f64";
    public String getCode() {
        return type.toString()+postfix;
    }
    public Demote(WasmType tp)
    {
        this.type = tp;
    }
}
