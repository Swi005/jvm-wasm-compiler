package com.jvm.instruction.insn;

import com.jvm.instruction.Instruction;

public class BASTORE implements Instruction
{
    @Override
    public String getWAT() {
        return "call $set_elem_from_byte_array";
    }
}
