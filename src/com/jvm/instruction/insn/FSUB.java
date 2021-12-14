package com.jvm.instruction.insn;

import com.jvm.instruction.Instruction;

public class FSUB implements Instruction
{
    @Override
    public String getWAT() {
        return "F32.sub";
    }
}
