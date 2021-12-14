package com.jvm.instruction.insn;

import com.jvm.instruction.Instruction;

public class RETURN implements Instruction
{
    @Override
    public String getWAT() {
        return "return";
    }
}
