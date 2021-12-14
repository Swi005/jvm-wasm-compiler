package com.jvm.instruction.insn;

import com.jvm.instruction.Instruction;

public class ACONST_NULL implements Instruction
{
    @Override
    public String getWAT() {
        return "i32.const 0";
    }
}
