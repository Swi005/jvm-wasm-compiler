package com.jvm.instruction.typeInsn;

import com.jvm.instruction.Instruction;

public class ANEWARRAY implements Instruction
{
    private final String type;
    public ANEWARRAY(String type) {
        this.type = type;
    }

    @Override
    public String getWAT() {
        return "call $new_i32_array";
    }
}
