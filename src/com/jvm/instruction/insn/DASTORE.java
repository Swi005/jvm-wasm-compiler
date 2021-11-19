package com.jvm.instruction.insn;

import com.jvm.instruction.Instruction;

public class DASTORE implements Instruction
{
    @Override
    public String getCode() {
        return "call $set_elem_from_f64_array";
    }
}