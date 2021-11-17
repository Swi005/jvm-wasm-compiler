package com.wat.instructions;

import java.util.List;

public class Loop implements Instruction
{
    public static final byte opCode = 0x03;
    public static final String instruction = "loop";
    public final String loopTag;
    public final List<Instruction> instructionList;
    public Loop(String name, List<Instruction> instructionList)
    {
        this.loopTag = name;
        this.instructionList = instructionList;
    }

    public String getCode() {
        StringBuilder str = new StringBuilder("(").append(instruction).append(" ").append(loopTag).append("\n");
        for (Instruction i:instructionList) {
            str.append("    ").append(i.getCode());
        }
        return str.append(")\n").toString();
    }

}
