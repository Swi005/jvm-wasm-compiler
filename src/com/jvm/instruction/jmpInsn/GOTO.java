package com.jvm.instruction.jmpInsn;
import com.jvm.instruction.Instruction;
import org.objectweb.asm.Label;

public class GOTO implements Instruction {
    private final Label label;

    public GOTO(Label label) {
        this.label = label;
    }

    @Override
    public String getWAT() {
        return "br $" + label.toString();
    }
}