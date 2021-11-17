package com.jvm.instruction.instr;

import com.wat.instructions.Instruction;

public class LSUB implements Instruction
{
    @Override
    public String getCode() {
        return "i64.sub";
    }
}
