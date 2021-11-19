package com.jvm.instruction.insn;

import com.jvm.instruction.Instruction;

public class D2L implements Instruction {
    @Override
    public String getCode() {
        return "i64.trunc_f64_s";
    }
}