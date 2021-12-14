package com.jvm.instruction.insn;

import com.jvm.instruction.Instruction;

public class LUSHR implements Instruction {
    @Override
    public String getWAT() {
        return "i64.shr_u";
    }
}
