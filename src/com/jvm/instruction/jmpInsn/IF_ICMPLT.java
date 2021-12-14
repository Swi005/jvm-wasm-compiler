package com.jvm.instruction.jmpInsn;

import com.jvm.instruction.Instruction;
import org.objectweb.asm.Label;

public class IF_ICMPLT implements Instruction {
    private final Label label;

    public IF_ICMPLT(Label label) {
        this.label = label;
    }

    @Override
    public String getWAT() {
        return "i32.lt_s \n br_if $" + label.toString();
    }
}
