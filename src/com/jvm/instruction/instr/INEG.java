package com.jvm.instruction.instr;

import com.wat.instructions.Instruction;

public class INEG implements Instruction
{
    @Override
    public String getCode() {
        return "call $ineg";
    }
}
