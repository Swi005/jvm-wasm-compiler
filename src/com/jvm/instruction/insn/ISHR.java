package com.jvm.instruction.insn;

import com.jvm.instruction.Instruction;

public class ISHR implements Instruction {
    @Override
    public String getWAT() {
        return "i32.shr_s";
    }
}
