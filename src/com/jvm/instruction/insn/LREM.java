package com.jvm.instruction.insn;

import com.jvm.instruction.Instruction;

public class LREM implements Instruction
{
    @Override
    public String getWAT() {
        return "i64.rem";
    }
}
