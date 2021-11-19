package com.jvm.instruction.insn;

import com.jvm.instruction.Instruction;

public class ISHL implements Instruction {
    @Override
    public String getCode() {
        return "i32.shl";
    }
}
