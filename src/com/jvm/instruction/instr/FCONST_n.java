package com.jvm.instruction.instr;

import com.wat.instructions.Instruction;

public class FCONST_n implements Instruction {
    private final float n;
    public FCONST_n(float n)
    {
        this.n = n;
    }
    @Override
    public String getCode() {
        return "f32.const " +n;
    }
}
