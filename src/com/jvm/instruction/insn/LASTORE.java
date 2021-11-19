package com.jvm.instruction.insn;

import com.jvm.instruction.Instruction;

public class LASTORE implements Instruction
{
    @Override
    public String getCode() {
        return "call $set_elem_from_i64_array";
    }
}