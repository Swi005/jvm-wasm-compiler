package com.jvm.instruction.instr;

import com.wat.instructions.Instruction;

public class DASTORE implements Instruction
{
    @Override
    public String getCode() {
        return "call $set_elem_from_f64_array";
    }
}