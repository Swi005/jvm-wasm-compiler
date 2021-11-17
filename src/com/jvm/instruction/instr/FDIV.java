package com.jvm.instruction.instr;

import com.wat.instructions.Instruction;

public class FDIV implements Instruction
{
    @Override
    public String getCode() {
        return "f32.div";
    }
}