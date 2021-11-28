package com.jvm.instruction.insn;

import com.jvm.instruction.Instruction;

public class RETURN implements Instruction
{
    @Override
    public String getCode() {
        return "return";
    }
}
