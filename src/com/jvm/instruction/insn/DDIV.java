package com.jvm.instruction.insn;

import com.jvm.instruction.Instruction;

public class DDIV implements Instruction
{
    @Override
    public String getCode() {
        return "f64.div_s";
    }
}
