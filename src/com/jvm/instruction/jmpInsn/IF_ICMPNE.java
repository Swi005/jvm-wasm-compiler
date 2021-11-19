package com.jvm.instruction.jmpInsn;

import com.jvm.instruction.Instruction;
import org.objectweb.asm.Label;

public class IF_ICMPNE implements Instruction {
    private final Label label;

    public IF_ICMPNE(Label label) {
        this.label = label;
    }

    @Override
    public String getCode() {
        return "i32.ne \n br_if $" + label.toString();
    }
}