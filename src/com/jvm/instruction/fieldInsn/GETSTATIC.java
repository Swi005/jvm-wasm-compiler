package com.jvm.instruction.fieldInsn;

import com.jvm.instruction.Instruction;

public class GETSTATIC implements Instruction
{
    private final String name;

    public GETSTATIC(String name) {
        this.name = name;
    }

    @Override
    public String getWAT() {
        return "global.get $"+name;
    }
}
