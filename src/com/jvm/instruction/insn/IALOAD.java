package com.jvm.instruction.insn;

import com.jvm.instruction.Instruction;

public class IALOAD implements Instruction
{
    @Override
    public String getCode() {
        return "call $get_elem_from_i32_array";
    }
}
