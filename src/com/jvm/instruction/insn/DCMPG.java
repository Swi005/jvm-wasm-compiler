package com.jvm.instruction.insn;

import com.jvm.instruction.Instruction;

public class DCMPG implements Instruction {
    @Override
    public String getCode() {
        return "f64.eq";
    }
}

