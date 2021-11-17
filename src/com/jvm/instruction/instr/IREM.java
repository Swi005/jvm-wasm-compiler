package com.jvm.instruction.instr;

import com.wat.instructions.Instruction;

public class IREM implements Instruction
{
    @Override
    public String getCode() {
        return "i32.rem";
    }
}
