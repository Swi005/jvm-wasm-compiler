package com.jvm.instruction.insn;

import com.jvm.instruction.Instruction;

public class I2F implements Instruction {
    @Override
    public String getCode() {
        return "f32.convert_i32_s";
    }
}