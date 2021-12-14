package com.jvm.instruction.methodCallInsn;

import com.Util;
import com.jvm.instruction.Instruction;

public class INVOKE implements Instruction {
    private final String name;

    public INVOKE(String name) {
        this.name = Util.encodeString(name);
    }

    @Override
    public String getCode() {
        return "call $"+name;
    }
}
