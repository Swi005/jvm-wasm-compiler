package com.jvm.instruction.insn;

import com.jvm.instruction.Instruction;

public class FASTORE implements Instruction
{
    @Override
    public String getWAT() {
        return "call $set_elem_from_f32_array";
    }
}
