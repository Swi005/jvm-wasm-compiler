package com.jvm.instruction.instr;

import com.wat.instructions.Instruction;

public class BALOAD implements Instruction
{
    @Override
    public String getCode() {
        return "call $get_elem_from_byte_array";
    }
}