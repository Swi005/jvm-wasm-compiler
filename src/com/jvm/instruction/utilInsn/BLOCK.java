package com.jvm.instruction.utilInsn;

import com.jvm.instruction.Instruction;

public class BLOCK implements Instruction
{
    private final String name;
    public BLOCK(String name)
    {
        this.name = name;
    }

    @Override
    public String getCode() {
        return "block $"+name;
    }
}
