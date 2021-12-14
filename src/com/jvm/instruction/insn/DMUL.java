package com.jvm.instruction.insn;

import com.jvm.instruction.Instruction;

public class DMUL implements Instruction
{
    @Override
    public String getWAT() {
        return "f64.mul";
    }
}