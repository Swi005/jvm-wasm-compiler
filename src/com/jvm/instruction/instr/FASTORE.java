package com.jvm.instruction.instr;

import com.wat.instructions.Instruction;

public class FASTORE implements Instruction
{
    @Override
    public String getCode() {
        return "call $set_elem_from_f32_array";
    }
}
