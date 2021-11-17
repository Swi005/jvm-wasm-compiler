package com.wat.instructions;

public class Call implements Instruction
{
    public static final byte opCode = 0x10;
    public static final String instruction = "call";
    public final String funcName;
    public Call(String nm)
    {
        this.funcName = nm;
    }

    public String getCode() {
        return instruction+" "+funcName+"\n";
    }
}
