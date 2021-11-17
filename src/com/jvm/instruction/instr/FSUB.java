package com.jvm.instruction.instr;

import com.wat.instructions.Instruction;

public class FSUB implements Instruction
{
    @Override
    public String getCode() {
        return "F32.sub";
    }
}
