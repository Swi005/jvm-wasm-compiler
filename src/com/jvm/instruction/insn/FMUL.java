package com.jvm.instruction.insn;

import com.jvm.instruction.Instruction;

public class FMUL implements Instruction
{
    @Override
    public String getCode() {
        return "f32.mul";
    }
}
