package com.jvm.instruction.insn;

import com.jvm.instruction.Instruction;

public class IDIV implements Instruction
{
    @Override
    public String getCode() {
        return "i32.div_S";
    }
}