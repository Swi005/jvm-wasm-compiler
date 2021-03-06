package com.evaluator;

import com.Util;
import com.jvm.instruction.InsnFactory;
import com.jvm.instruction.WasmType;
import com.jvm.instruction.utilInsn.BLOCK;
import com.jvm.instruction.utilInsn.END;
import com.structures.WASM_Method;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.*;


public class MethodEvaluator
{
    MethodNode node;
    WASM_Method method;

    public MethodEvaluator(MethodNode node)
    {
        this.node = node;
        this.method = new WASM_Method();

        method.name = Util.encodeString(node.name);
        evalAnnotation();
        evalVars();
        evalInstructions();
    }

    /**
     * Looks through method annotations and checks if its public/static
     */
    private void evalAnnotation()
    {
        switch (node.access)
        {
            case Opcodes.ACC_STATIC:
                method.isStatic = true;
            case Opcodes.ACC_PRIVATE:
                method.isStatic = false;
            default:
                return;
        }
    }

    /**
     * Evaluate the instructions
     */
    private void evalInstructions()
    {
        LabelNode last = null;
        for (int i=0; i<node.instructions.size(); i++)
        {
            AbstractInsnNode n = node.instructions.get(i);
            if( n instanceof IntInsnNode) {
                IntInsnNode m = (IntInsnNode) n;
                method.instructions.add(InsnFactory.intInsnFactory(m.getOpcode(),m.operand));
                continue;
            }
            if( n instanceof JumpInsnNode) {
                JumpInsnNode m = (JumpInsnNode) n;
                method.instructions.add(InsnFactory.jmpInsnFactory(m.getOpcode(),m.label.getLabel()));
                continue;
            }
            if( n instanceof LdcInsnNode) {
                LdcInsnNode m = (LdcInsnNode) n;
                method.instructions.add(InsnFactory.LdcInsnFactory(m.cst));
                break;
            }
            if( n instanceof MethodInsnNode) {
                MethodInsnNode m = (MethodInsnNode) n;
                method.instructions.add(InsnFactory.methodCallInsnFactory(m.getOpcode(), m.name));
                continue;
            }
            if( n instanceof InsnNode) {
                InsnNode m = (InsnNode) n;
                method.instructions.add(InsnFactory.zeroOpFactory(m.getOpcode()));
                continue;
            }
            if( n instanceof VarInsnNode) {
                VarInsnNode m = (VarInsnNode) n;
                method.instructions.add(InsnFactory.varInsnFactory(m.getOpcode(),m.var));
                continue;
            }
            if( n instanceof TypeInsnNode) {
                TypeInsnNode m = (TypeInsnNode) n;
                method.instructions.add(InsnFactory.typeInsnFactory(m.getOpcode(),m.desc));
                continue;
            }
            if( n instanceof FieldInsnNode) {
                FieldInsnNode m = (FieldInsnNode) n;
                method.instructions.add(InsnFactory.fieldInsnFactory(m.getOpcode(),m.name));
                continue;
            }
            if( n instanceof LabelNode) {
                LabelNode m = (LabelNode) n;

                //End last label if we see a new label
                if(last != null)
                    method.instructions.add(new END());

                method.instructions.add(new BLOCK(m.getLabel().toString()));
                last = m;
                continue;
            }
        }
        if(last != null)//Add an End() so we can close the label
            method.instructions.add(new END());
    }

    /**
     * Eval vars
     */
    private void evalVars()
    {
        if(node.parameters != null)
            for (int i = 0; i < node.parameters.size(); i++) {
                LocalVariableNode n = (LocalVariableNode) node.localVariables.get(i);
                method.params.add(WasmType.fromType(Type.getType(n.desc)));

            }
        if(node.localVariables != null)
            for (int i = method.params.size(); i < node.localVariables.size(); i++) {
                LocalVariableNode n = (LocalVariableNode) node.localVariables.get(i);
                method.localVars.add(WasmType.fromType(Type.getType(n.desc)));
            }
    }

    /**
     * Return the method
     * @return
     */
    public WASM_Method getMethod()
    {
        return method;
    }
}
