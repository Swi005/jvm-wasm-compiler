package com.jvm.instruction.insn;

import com.jvm.instruction.Instruction;

public class LDIV implements Instruction
{
    @Override
    public String getCode() {
        return "i64.div_s";
    }
}
