package com.wat.instructions;

public class Return implements Instruction
{
    public static final byte opCode = 0x0F;
    public static final String instruction = "return";

    public String getCode() {
        return instruction;
    }
}
