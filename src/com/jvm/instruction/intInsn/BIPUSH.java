package com.jvm.instruction.intInsn;

import com.jvm.instruction.Instruction;

public class BIPUSH implements Instruction {

    private final byte b;
    public BIPUSH(byte b)
    {
        this.b = b;
    }
    @Override
    public String getCode() {
        return "i32.const "+ b;
    }
}
