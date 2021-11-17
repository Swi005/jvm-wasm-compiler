package com.wat.instructions;

import java.util.List;

public class Else implements Instruction
{
    public static final byte opCode = 0x05;
    public static final String instruction = "else";
    public final List<Instruction> instructionList;
    public Else(List<Instruction> instructionList)
    {
        this.instructionList = instructionList;
    }
    public String getCode() {
        StringBuilder str = new StringBuilder("("+instruction+"\n");
        for (Instruction i: instructionList) {
            str.append("    ").append(i.getCode());
        }
        str.append(")\n");
        return str.toString();
    }
}
