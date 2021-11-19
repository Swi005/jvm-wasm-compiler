package com.jvm.instruction.insn;

import com.jvm.instruction.Instruction;

public class LSHL implements Instruction {
    @Override
    public String getCode() {
        return "i64.shl";
    }
}
