package com.jvm.instruction.insn;

import com.jvm.instruction.Instruction;

public class FCONST_n implements Instruction {
    private final float n;
    public FCONST_n(float n)
    {
        this.n = n;
    }
    @Override
    public String getWAT() {
        return "f32.const " +n;
    }
}
