package com.wat.instructions;

public class End implements Instruction
{
    public static final byte opCode = 0x0B;
    public static final String instruction = "end";

    public String getCode() {
        return instruction+"\n";
    }
}
