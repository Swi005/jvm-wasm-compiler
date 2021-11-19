package com.jvm.instruction.insn;

import com.jvm.instruction.Instruction;

public class F2L implements Instruction {
    @Override
    public String getCode() {
        return "i64.trunc_f32_s";
    }
}
