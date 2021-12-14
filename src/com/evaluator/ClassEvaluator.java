package com.evaluator;

import com.jvm.instruction.WasmType;
import com.structures.WASM_Class;
import com.structures.WASM_Method;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.*;
import java.util.ArrayList;
import java.util.List;

public class ClassEvaluator
{
    WASM_Class wasm_class;
    ClassNode node;

    public ClassEvaluator(ClassNode node)
    {
        this.node = node;
        wasm_class = new WASM_Class();
        wasm_class.className = node.name;
        evalAccessFlags();
        evalFields();
        evalMethods();
    }
    private void evalAccessFlags()
    {
        switch (node.access)
        {
            case Opcodes.ACC_STATIC:
                wasm_class.isStatic = true;
            default:
                return;
        }
    }

    private void evalMethods() {
        for (int i = 0; i < node.methods.size(); i++) {
            MethodEvaluator eval = new MethodEvaluator((MethodNode)node.methods.get(i));
            wasm_class.methods.add(eval.getMethod());
        }
    }

    private void evalFields()
    {
        for (int i=0; i< node.fields.size(); i++)
        {
            FieldNode fn = (FieldNode)node.fields.get(i);//WTF? casting b wild
            wasm_class.fields.put(fn.name, WasmType.fromType(Type.getType(fn.desc)));
        }
    }

    public WASM_Class get_Class()
    {
        return wasm_class;
    }
}
