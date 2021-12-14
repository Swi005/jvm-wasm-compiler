package com.jvm.instruction.insn;

import com.jvm.instruction.Instruction;

public class FALOAD implements Instruction
{
    @Override
    public String getWAT() {
        return "call $get_elem_from_f32_array";
    }
}
