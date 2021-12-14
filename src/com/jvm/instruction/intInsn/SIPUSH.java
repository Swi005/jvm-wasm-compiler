package com.jvm.instruction.intInsn;

import com.jvm.instruction.Instruction;

public class SIPUSH implements Instruction {

    private final short b;
    public SIPUSH(short b)
    {
        this.b = b;
    }
    @Override
    public String getWAT() {
        return "i32.const "+ b;
    }
}