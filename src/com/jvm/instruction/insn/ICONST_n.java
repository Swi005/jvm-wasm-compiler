package com.jvm.instruction.insn;

import com.jvm.instruction.Instruction;

public class ICONST_n implements Instruction {

    private final int n;
    public ICONST_n(int n)
    {
        this.n = n;
    }
    @Override
    public String getWAT() {
        return "i32.const " +n;
    }
}
