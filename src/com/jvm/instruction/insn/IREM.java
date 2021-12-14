package com.jvm.instruction.insn;

import com.jvm.instruction.Instruction;

public class IREM implements Instruction
{
    @Override
    public String getWAT() {
        return "i32.rem";
    }
}
