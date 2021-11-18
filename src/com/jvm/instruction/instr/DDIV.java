package com.jvm.instruction.instr;

import com.wat.instructions.Instruction;

public class DDIV implements Instruction
{
    @Override
    public String getCode() {
        return "f64.div_s";
    }
}
