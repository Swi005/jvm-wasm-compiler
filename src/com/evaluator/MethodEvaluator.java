package com.evaluator;

import com.jvm.instruction.InsnFactory;
import com.jvm.instruction.WasmType;
import com.jvm.instruction.utilInsn.BLOCK;
import com.jvm.instruction.utilInsn.END;
import com.structures.WASM_Method;
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

        method.name = node.name;
        evalAnnotation();
        evalVars();
        evalInstructions();
    }

    /**
     * Looks through method annotations and checks if its public/static
     */
    private void evalAnnotation()
    {
        //TODO: evalAnnotation
    }

    private void evalInstructions()
    {
        LabelNode last = null;
        for (int i=0; i<node.instructions.size(); i++)
        {
            AbstractInsnNode n = node.instructions.get(i);
            if( n instanceof IntInsnNode) {
                IntInsnNode m = (IntInsnNode) n;
                method.instructions.add(InsnFactory.intInsnFactory(m.getOpcode(),m.operand));
                break;
            }
            if( n instanceof JumpInsnNode) {
                JumpInsnNode m = (JumpInsnNode) n;
                method.instructions.add(InsnFactory.jmpInsnFactory(m.getOpcode(),m.label.getLabel()));
                break;
            }
            if( n instanceof LdcInsnNode) {
                LdcInsnNode m = (LdcInsnNode) n;
                method.instructions.add(InsnFactory.LdcInsnFactory(m.cst));
                break;
            }
            if( n instanceof MethodInsnNode) {
                MethodInsnNode m = (MethodInsnNode) n;
                method.instructions.add(InsnFactory.methodCallInsnFactory(m.getOpcode(), m.name));
                break;
            }
            if( n instanceof InsnNode) {
                InsnNode m = (InsnNode) n;
                method.instructions.add(InsnFactory.zeroOpFactory(m.getOpcode()));
                break;
            }
            if( n instanceof VarInsnNode) {
                VarInsnNode m = (VarInsnNode) n;
                method.instructions.add(InsnFactory.varInsnFactory(m.getOpcode(),m.var));
                break;
            }
            if( n instanceof TypeInsnNode) {
                TypeInsnNode m = (TypeInsnNode) n;
                method.instructions.add(InsnFactory.typeInsnFactory(m.getOpcode(),m.desc));
                break;
            }
            if( n instanceof FieldInsnNode) {
                FieldInsnNode m = (FieldInsnNode) n;
                method.instructions.add(InsnFactory.fieldInsnFactory(m.getOpcode(),m.name));
                break;
            }
            if( n instanceof LabelNode) {
                LabelNode m = (LabelNode) n;

                //End last label if we see a new label
                if(last != null)//TODO: MAY CAUSE BUG
                    method.instructions.add(new END());

                method.instructions.add(new BLOCK(m.getLabel().toString()));
                last = m;
                break;
            }
        }
    }

    private void evalVars()
    {
        for (int i = 0; i < node.parameters.size(); i++) {
            ParameterNode n = (ParameterNode) node.parameters.get(i);
            //TODO: Figure out params
        }
        for (int i = 0; i < node.localVariables.size(); i++) {
            LocalVariableNode n = (LocalVariableNode) node.localVariables.get(i);
            method.params.add(WasmType.fromType(Type.getType(n.desc)));
        }
    }

    public WASM_Method getMethod()
    {
        return method;
    }
}
