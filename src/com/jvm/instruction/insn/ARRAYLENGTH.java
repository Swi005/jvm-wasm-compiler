package com.jvm.instruction.insn;

import com.jvm.instruction.Instruction;

public class ARRAYLENGTH implements Instruction {
    @Override
    public String getCode() {
        return "call $array_size";
    }
}
