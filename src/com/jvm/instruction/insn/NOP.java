package com.jvm.instruction.insn;

import com.jvm.instruction.Instruction;

public class NOP implements Instruction
{
    @Override
    public String getWAT() {
        return "nop";
    }
}
