package com.jvm.instruction.insn;

import com.jvm.instruction.Instruction;

public class POP implements Instruction {
    @Override
    public String getCode() {
        return "drop";
    }
}
