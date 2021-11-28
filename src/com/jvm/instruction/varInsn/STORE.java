package com.jvm.instruction.varInsn;

import com.jvm.instruction.Instruction;

public class STORE implements Instruction {
    private final int varIndex;

    public STORE(int varIndex) {
        this.varIndex = varIndex;
    }

    @Override
    public String getCode() {
        return "local.set "+varIndex;
    }
}
