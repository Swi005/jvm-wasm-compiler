package com.jvm.instruction.insn;

import com.jvm.instruction.Instruction;

public class I2D implements Instruction {
    @Override
    public String getWAT() {
        return "f64.convert_i32_s";
    }
}