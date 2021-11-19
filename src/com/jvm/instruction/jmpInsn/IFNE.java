package com.jvm.instruction.jmpInsn;

import com.jvm.instruction.Instruction;
import org.objectweb.asm.Label;


public class IFNE implements Instruction {
    private final Label label;

    public IFNE(Label label) {
        this.label = label;
    }

    @Override
    public String getCode() {
        return "i32.const 0 \n i32.ne \n br_if $" + label.toString();
    }
}
