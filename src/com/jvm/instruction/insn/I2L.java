package com.jvm.instruction.insn;

import com.jvm.instruction.Instruction;

public class I2L implements Instruction {
    @Override
    public String getWAT() {
        return "i64.extend32_s";
    }
}
