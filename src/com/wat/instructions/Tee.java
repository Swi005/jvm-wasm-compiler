package com.wat.instructions;

public class Tee implements Instruction
{
    public static final String postfix = ".tee";
    public final String instruction;
    public final VarType type;
    public final String arg;
    public Tee(VarType tp, String arg)
    {
        this.type =tp;
        this.arg = arg;
        this.instruction = tp.toString()+postfix;
    }

    public String getCode() {
        return instruction+" "+arg+"\n";
    }
}
