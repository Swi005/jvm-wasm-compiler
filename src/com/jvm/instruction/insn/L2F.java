package com.jvm.instruction.insn;

import com.jvm.instruction.Instruction;

public class L2F implements Instruction {
    @Override
    public String getWAT() {
        return "f32.convert_i64_s";
    }
}
