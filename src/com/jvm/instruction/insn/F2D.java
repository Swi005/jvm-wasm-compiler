package com.jvm.instruction.insn;

import com.jvm.instruction.Instruction;

public class F2D implements Instruction {
    @Override
    public String getCode() {
        return "f64.promote_f32";
    }
}
