package com.jvm.instruction.insn;

import com.jvm.instruction.Instruction;

public class FADD implements Instruction
{
    @Override
    public String getCode() {
        return "f32.add";
    }
}
