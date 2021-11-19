package com.jvm.instruction.jmpInsn;

import com.jvm.instruction.Instruction;
import org.objectweb.asm.Label;

public class IFEQ implements Instruction {
    private final Label label;

    public IFEQ(Label label) {
        this.label = label;
    }

    @Override
    public String getCode() {
        return "i32.eqz \n br_if $" + label.toString();
    }
}