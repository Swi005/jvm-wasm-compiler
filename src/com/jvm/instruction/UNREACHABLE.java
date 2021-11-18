package com.jvm.instruction;

import com.wat.instructions.Instruction;

public class UNREACHABLE implements Instruction {
    @Override
    public String getCode() {
        return "unreachable";
    }
}
