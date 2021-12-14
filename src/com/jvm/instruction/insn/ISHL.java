package com.jvm.instruction.insn;

import com.jvm.instruction.Instruction;

public class ISHL implements Instruction {
    @Override
    public String getWAT() {
        return "i32.shl";
    }
}
