package com.jvm.instruction.insn;

import com.jvm.instruction.Instruction;

public class LCMP implements Instruction
{
    @Override
    public String getCode() {
        return "call $LCMP";
    }
}
