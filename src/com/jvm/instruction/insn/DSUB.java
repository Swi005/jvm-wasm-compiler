package com.jvm.instruction.insn;

import com.jvm.instruction.Instruction;

public class DSUB implements Instruction
{
    @Override
    public String getCode() {
        return "f64.sub";
    }
}