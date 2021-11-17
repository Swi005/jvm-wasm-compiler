package com.jvm.instruction.instr;

import com.wat.instructions.Instruction;

public class FREM implements Instruction
{
    @Override
    public String getCode() {
        return "f32.rem";
    }
}
