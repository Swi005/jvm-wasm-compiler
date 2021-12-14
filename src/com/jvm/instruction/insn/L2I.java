package com.jvm.instruction.insn;

import com.jvm.instruction.Instruction;

public class L2I implements Instruction {
    @Override
    public String getWAT() {
        return "i32.wrap_i64";
    }
}
