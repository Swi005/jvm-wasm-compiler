package com.jvm.instruction.insn;

import com.jvm.instruction.Instruction;

public class D2I implements Instruction {
    @Override
    public String getCode() {
        return "i32.trunc_f64_s";
    }
}
