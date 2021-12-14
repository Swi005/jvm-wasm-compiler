package com.jvm.instruction.varInsn;

import com.jvm.instruction.Instruction;

public class LOAD implements Instruction
{
    private final int varIndex;

    public LOAD(int varIndex) {
        this.varIndex = varIndex;
    }

    @Override
    public String getWAT() {
        return "local.get " + varIndex;
    }
}