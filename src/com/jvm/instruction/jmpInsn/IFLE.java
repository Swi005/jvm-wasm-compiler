package com.jvm.instruction.jmpInsn;

import com.jvm.instruction.Instruction;
import org.objectweb.asm.Label;

public class IFLE implements Instruction {
    private final Label label;

    public IFLE(Label label) {
        this.label = label;
    }

    @Override
    public String getWAT() {
        return "i32.const 0 \n i32.le_s \n br_if $" + label.toString();
    }
}
