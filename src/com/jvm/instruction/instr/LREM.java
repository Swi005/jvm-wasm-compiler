package com.jvm.instruction.instr;

import com.wat.instructions.Instruction;

public class LREM implements Instruction
{
    @Override
    public String getCode() {
        return "i64.rem";
    }
}
