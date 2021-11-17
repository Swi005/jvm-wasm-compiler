package com.wat.instructions;

public class Nop implements Instruction
{
    public static final byte opCode = 0x01;
    public static final String instruction = "nop";

    public String getCode() {
        return instruction;
    }
}
