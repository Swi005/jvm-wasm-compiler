package com.jvm.instruction.insn;

import com.jvm.instruction.Instruction;

public class DNEG implements Instruction {
    @Override
    public String getWAT() {
        return "f64.neg";
    }
}
