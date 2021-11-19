package com.jvm.instruction.insn;

import com.jvm.instruction.Instruction;

public class D2F implements Instruction {
    @Override
    public String getCode() {
        return "f32.demote_f64";
    }
}
