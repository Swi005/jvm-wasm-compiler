package com.jvm.instruction.instr;

import com.wat.instructions.Instruction;

public class POP implements Instruction {
    @Override
    public String getCode() {
        return "drop";
    }
}
