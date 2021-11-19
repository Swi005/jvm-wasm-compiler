package com.jvm.instruction.insn;

import com.jvm.instruction.Instruction;

public class ISUB implements Instruction
{
    @Override
    public String getCode() {
        return "i32.sub";
    }
}
