package com.jvm.instruction.insn;

import com.jvm.instruction.Instruction;

public class LSHR implements Instruction {
    @Override
    public String getCode() {
        return "i64.shr_s";
    }
}
