package com.evaluator;

import com.jvm.instruction.WasmType;
import com.structures.WASM_Class;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.*;
import java.util.ArrayList;
import java.util.List;

public class ClassEvaluator
{
    List<MethodEvaluator> methodEvals = new ArrayList<>();
    WASM_Class wasm_class;
    ClassNode node;

    public ClassEvaluator(ClassNode node)
    {
        this.node = node;
        wasm_class = new WASM_Class();
        wasm_class.className = node.name;
        evalFields();
        evalMethods();
    }

    private void evalMethods() {
        for (int i = 0; i < node.methods.size(); i++) {
            MethodNode n = (MethodNode)node.methods.get(i);

        }
    }

    private void evalFields()
    {
        for (int i=0; i< node.fields.size(); i++)
        {
            FieldNode fn = (FieldNode)node.fields.get(i);//WTF?
            wasm_class.fields.put(fn.name, WasmType.fromType(Type.getType(fn.desc)));

        }
    }

    public WASM_Class get_Class()
    {
        //TODO: Add stuff to the wasm_class
        return wasm_class;
    }
}
