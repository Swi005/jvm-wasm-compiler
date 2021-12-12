package com.jvm.instruction.insn;

import com.jvm.instruction.Instruction;

public class POP2 implements Instruction {
    @Override
    public String getCode()
    {
        return "drop \n drop";
    }
}
