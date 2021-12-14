package com.jvm.instruction.insn;

import com.jvm.instruction.Instruction;

public class LNEG implements Instruction
{
    @Override
    public String getWAT() {
        return "call $lneg";
    }
}
