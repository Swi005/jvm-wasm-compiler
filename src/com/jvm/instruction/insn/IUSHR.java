package com.jvm.instruction.insn;

import com.jvm.instruction.Instruction;

public class IUSHR implements Instruction {
    @Override
    public String getCode() {
        return "i32.shr_u";
    }
}
