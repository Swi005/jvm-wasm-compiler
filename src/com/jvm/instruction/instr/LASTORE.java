package com.jvm.instruction.instr;

import com.wat.instructions.Instruction;

public class LASTORE implements Instruction
{
    @Override
    public String getCode() {
        return "call $set_elem_from_i64_array";
    }
}