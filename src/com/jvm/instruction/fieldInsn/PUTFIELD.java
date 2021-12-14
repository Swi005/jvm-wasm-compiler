package com.jvm.instruction.fieldInsn;

import com.jvm.instruction.Instruction;

public class PUTFIELD implements Instruction {
    private final String name;

    public PUTFIELD(String name) {
        this.name = name;
    }

    @Override
    public String getWAT() {
        return "call $"+name+"_set_";
    }
}
