package com.jvm.instruction.utilInsn;

import com.jvm.instruction.Instruction;

public class MallocWrapper implements Instruction
{
    final boolean isFree;
    private final int i;
    public MallocWrapper(int i, boolean isFree) {
        this.isFree = isFree;
        this.i = i;
    }

    @Override
    public String getWAT() {
        if(isFree)
            return "(call $free (i32.const "+ i+"))";
        else
            return "(call $malloc (i32.const "+i+"))";
    }
}
