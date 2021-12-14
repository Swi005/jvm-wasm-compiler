package com.jvm.instruction.insn;

import com.jvm.instruction.Instruction;

public class DCMPG implements Instruction {
    @Override
    public String getWAT() {
        return "f64.eq";
    }
}

