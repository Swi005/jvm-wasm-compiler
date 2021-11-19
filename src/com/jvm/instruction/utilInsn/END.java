package com.jvm.instruction.utilInsn;

import com.jvm.instruction.Instruction;

public class END implements Instruction {
    @Override
    public String getCode() {
        return "end";
    }
}
