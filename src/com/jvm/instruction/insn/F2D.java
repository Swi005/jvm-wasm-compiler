package com.jvm.instruction.insn;

import com.jvm.instruction.Instruction;

public class F2D implements Instruction {
    @Override
    public String getWAT() {
        return "f64.promote_f32";
    }
}
