package com.jvm.instruction.fieldInsn;

import com.jvm.instruction.Instruction;

public class PUTSTATIC implements Instruction {
    private final String name;

    public PUTSTATIC(String name) {
        this.name = name;
    }

    @Override
    public String getCode() {
        return "global.set $"+name;
    }
}
