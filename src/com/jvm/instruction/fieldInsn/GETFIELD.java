package com.jvm.instruction.fieldInsn;

import com.jvm.instruction.Instruction;

public class GETFIELD implements Instruction {
    private final String name;

    public GETFIELD(String name) {
        this.name = name;
    }

    @Override
    public String getWAT() {
        return "call $"+name+"_get_";
    }
}
