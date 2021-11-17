package com.visitor;

import com.wat.instructions.Instruction;
import org.objectweb.asm.MethodVisitor;

import java.util.ArrayList;
import java.util.List;

public class MethodEvaluator extends MethodVisitor
{
    public MethodEvaluator(int api) {
        super(api);
    }

    List<Instruction> instructions = new ArrayList<>();
}
