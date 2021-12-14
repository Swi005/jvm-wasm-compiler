package com.jvm.instruction.jmpInsn;

import com.jvm.instruction.Instruction;
import org.objectweb.asm.Label;

public class IF_ICMPEQ implements Instruction {
    private final Label label;

    public IF_ICMPEQ(Label label) {
        this.label = label;
    }

    @Override
    public String getWAT() {
        return "i32.eq \n br_if $" + label.toString();
    }
}