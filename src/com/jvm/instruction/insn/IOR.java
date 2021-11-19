package com.jvm.instruction.insn;

import com.jvm.instruction.Instruction;

public class IOR implements Instruction {
    @Override
    public String getCode() {
        return "i32.OR";
    }
}