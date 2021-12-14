package com.jvm.instruction.insn;

import com.jvm.instruction.Instruction;

public class DALOAD implements Instruction
{
    @Override
    public String getWAT() {
        return "call $get_elem_from_f64_array";
    }
}
