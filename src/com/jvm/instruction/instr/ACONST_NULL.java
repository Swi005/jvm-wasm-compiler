package com.jvm.instruction.instr;

import com.wat.instructions.Instruction;

public class ACONST_NULL implements Instruction
{
    @Override
    public String getCode() {
        return "i32.const 0";
    }
}
