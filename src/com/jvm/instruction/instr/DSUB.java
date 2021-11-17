package com.jvm.instruction.instr;

import com.wat.instructions.Instruction;

public class DSUB implements Instruction
{
    @Override
    public String getCode() {
        return "f64.sub";
    }
}