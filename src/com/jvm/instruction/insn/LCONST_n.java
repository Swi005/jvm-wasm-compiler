package com.jvm.instruction.insn;

import com.jvm.instruction.Instruction;

public class LCONST_n implements Instruction {
    private final long n;
    public LCONST_n(long n)
    {
        this.n = n;
    }
    @Override
    public String getWAT() {
        return "i64.const " +n;
    }
}
