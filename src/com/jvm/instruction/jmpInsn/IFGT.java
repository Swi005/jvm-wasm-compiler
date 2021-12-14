package com.jvm.instruction.jmpInsn;

import com.jvm.instruction.Instruction;
import org.objectweb.asm.Label;

public class IFGT implements Instruction {
    private final Label label;

    public IFGT(Label label) {
        this.label = label;
    }

    @Override
    public String getWAT() {
        return "i32.const 0 \n i32.gt_s \n br_if $" + label.toString();
    }
}
