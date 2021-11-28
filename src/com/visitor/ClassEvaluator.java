package com.visitor;

import org.objectweb.asm.ClassVisitor;

public class ClassEvaluator extends ClassVisitor
{
    public ClassEvaluator(int api) {
        super(api);
    }
}
