package com.jvm.instruction.insn;

import com.jvm.instruction.Instruction;

public class LCMP implements Instruction
{
    @Override
    public String getWAT() {
        return "call $LCMP";
    }
}
