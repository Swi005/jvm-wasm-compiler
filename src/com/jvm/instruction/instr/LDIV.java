package com.jvm.instruction.instr;

import com.wat.instructions.Instruction;

public class LDIV implements Instruction
{
    @Override
    public String getCode() {
        return "i64.div_s";
    }
}
