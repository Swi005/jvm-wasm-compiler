package com.visitor;

import com.jvm.instruction.Instruction;
import com.jvm.instruction.insnFactory.InsnFactory;
import com.jvm.instruction.utilInsn.BLOCK;
import com.jvm.instruction.utilInsn.END;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;

import java.util.ArrayList;
import java.util.List;

public class MethodEvaluator extends MethodVisitor
{
    public MethodEvaluator(int api) {
        super(api);
    }

    List<Instruction> instructions = new ArrayList<>();
    private Label lastLabel = null;

    @Override
    public void visitLabel(Label label) {
        if(lastLabel != null)
            instructions.add(new END());//End previous block
        instructions.add(new BLOCK(label.toString()));
        lastLabel = label;
    }

    @Override
    public void visitInsn(int opcode) {
        instructions.add(InsnFactory.zeroOpFactory(opcode));
    }
}
