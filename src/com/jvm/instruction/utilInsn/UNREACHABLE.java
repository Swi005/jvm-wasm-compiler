package com.jvm.instruction.utilInsn;

import com.jvm.instruction.Instruction;

public class UNREACHABLE implements Instruction {
    @Override
    public String getWAT() {
        return "unreachable";
    }
}
