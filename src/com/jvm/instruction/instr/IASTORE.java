package com.jvm.instruction.instr;

import com.wat.instructions.Instruction;

public class IASTORE implements Instruction
{
    @Override
    public String getCode() {
        return "call $set_elem_from_i32_array";
    }
}
