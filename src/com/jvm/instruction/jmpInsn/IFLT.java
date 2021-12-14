package com.jvm.instruction.jmpInsn;

import com.jvm.instruction.Instruction;
import org.objectweb.asm.Label;

public class IFLT implements Instruction {
    private final Label label;

    public IFLT(Label label) {
        this.label = label;
    }

    @Override
    public String getWAT() {
        return "i32.const 0 \n i32.lt_s \n br_if $" + label.toString();
    }
}
