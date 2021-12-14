package com.jvm.instruction.insn;

import com.jvm.instruction.Instruction;

public class BALOAD implements Instruction
{
    @Override
    public String getWAT() {
        return "call $get_elem_from_byte_array";
    }
}