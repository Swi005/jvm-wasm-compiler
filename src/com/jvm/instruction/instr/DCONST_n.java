package com.jvm.instruction.instr;

import com.wat.instructions.Instruction;

public class DCONST_n implements Instruction {
    private final double n;
    public DCONST_n(double n)
    {
        this.n = n;
    }
    @Override
    public String getCode() {
        return "f64.const " +n;
    }
}
