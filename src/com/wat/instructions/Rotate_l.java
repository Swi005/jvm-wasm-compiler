package com.wat.instructions;

public class Rotate_l implements Instruction{
    public final WasmType type;
    public static final String postfix = ".rotl";
    public String getCode() {
        return type.toString()+postfix;
    }
    public Rotate_l(WasmType tp)
    {
        this.type = tp;
    }

}
