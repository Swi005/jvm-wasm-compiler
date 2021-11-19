package com.jvm.instruction.insn;

import com.jvm.instruction.Instruction;

public class INEG implements Instruction
{
    @Override
    public String getCode() {
        return "call $ineg";
    }
}
