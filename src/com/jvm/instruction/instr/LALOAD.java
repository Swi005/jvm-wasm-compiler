package com.jvm.instruction.instr;

import com.wat.instructions.Instruction;

public class LALOAD implements Instruction
{
    @Override
    public String getCode() {
        return "call $get_elem_from_i64_array";
    }
}