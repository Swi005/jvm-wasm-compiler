package com.jvm.instruction.insn;

import com.jvm.instruction.Instruction;

public class LSHL implements Instruction {
    @Override
    public String getWAT() {
        return "i64.shl";
    }
}
