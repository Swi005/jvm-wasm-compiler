package com.jvm.instruction.instr;

import com.wat.instructions.Instruction;

public class LADD implements Instruction
{
    @Override
    public String getCode() {
        return "i64.add";
    }
}
