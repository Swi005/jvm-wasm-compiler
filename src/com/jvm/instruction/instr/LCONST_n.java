package com.jvm.instruction.instr;

import com.wat.instructions.Instruction;

public class LCONST_n implements Instruction {
    private final long n;
    public LCONST_n(long n)
    {
        this.n = n;
    }
    @Override
    public String getCode() {
        return "i64.const " +n;
    }
}
