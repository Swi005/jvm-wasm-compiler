package com.jvm.instruction.methodCallInsn;

import com.jvm.instruction.Instruction;

public class INVOKE implements Instruction {
    private final String name;

    public INVOKE(String name) {
        this.name = name;
    }

    @Override
    public String getCode() {
        return "call $"+name;
    }
}
