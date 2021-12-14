package com.jvm.instruction.insn;

import com.jvm.instruction.Instruction;

public class DCONST_n implements Instruction {
    private final double n;
    public DCONST_n(double n)
    {
        this.n = n;
    }
    @Override
    public String getWAT() {
        return "f64.const " +n;
    }
}
