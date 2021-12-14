package com.jvm.instruction.jmpInsn;

import com.jvm.instruction.Instruction;
import org.objectweb.asm.Label;

public class IF_ICMPLE implements Instruction {
    private final Label label;

    public IF_ICMPLE(Label label) {
        this.label = label;
    }

    @Override
    public String getWAT() {
        return "i32.le_s \n br_if $" + label.toString();
    }
}
