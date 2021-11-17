package com.jvm.instruction.instr;

import com.wat.instructions.Instruction;

public class IMUL implements Instruction
{
    @Override
    public String getCode() {
        return "i32.mul";
    }
}
