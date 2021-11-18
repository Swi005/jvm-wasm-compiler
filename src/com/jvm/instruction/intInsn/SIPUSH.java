package com.jvm.instruction.intInsn;

import com.wat.instructions.Instruction;

public class SIPUSH implements Instruction {

    private final short b;
    public SIPUSH(short b)
    {
        this.b = b;
    }
    @Override
    public String getCode() {
        return "i32.const "+ b;
    }
}