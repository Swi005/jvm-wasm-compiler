package com.jvm.instruction.instr;

import com.wat.instructions.Instruction;

public class IALOAD implements Instruction
{
    @Override
    public String getCode() {
        return "call $get_elem_from_i32_array";
    }
}
