package com.jvm.instruction.insn;

import com.jvm.instruction.Instruction;

public class LALOAD implements Instruction
{
    @Override
    public String getWAT() {
        return "call $get_elem_from_i64_array";
    }
}