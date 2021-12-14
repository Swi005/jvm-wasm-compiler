package com.jvm.instruction.insn;

import com.jvm.instruction.Instruction;

public class ARRAYLENGTH implements Instruction {
    @Override
    public String getWAT() {
        return "call $array_size";
    }
}
