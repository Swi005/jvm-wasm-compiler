package com.jvm.instruction.insn;

import com.jvm.instruction.Instruction;

public class LSUB implements Instruction
{
    @Override
    public String getCode() {
        return "i64.sub";
    }
}