package com.jvm.instruction.insn;

import com.jvm.instruction.Instruction;

public class FDIV implements Instruction
{
    @Override
    public String getWAT() {
        return "f32.div_s";
    }
}