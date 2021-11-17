package com.jvm.instruction.instr;

import com.wat.instructions.Instruction;

public class NOP implements Instruction
{
    @Override
    public String getCode() {
        return "nop";
    }
}
