package com.jvm.instruction.instr;

import com.wat.instructions.Instruction;

public class LMUL implements Instruction
{
    @Override
    public String getCode() {
        return "i64.mul";
    }
}
