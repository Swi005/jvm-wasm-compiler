package com.jvm.instruction.instr;

import com.wat.instructions.Instruction;

public class ICONST_n implements Instruction {

    private final int n;
    public ICONST_n(int n)
    {
        this.n = n;
    }
    @Override
    public String getCode() {
        return "i32.const " +n;
    }
}
