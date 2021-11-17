package com.wat.instructions;

public class Branch implements Instruction
{
    public static final byte opCode = 0x0C;
    public static final String instruction = "br";
    public final String tag;
    public Branch(String name)
    {
        this.tag = name;
    }

    public String getCode() {
        return instruction+tag+"\n";
    }
}
