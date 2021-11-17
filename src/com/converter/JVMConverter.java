package com.converter;


import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.InsnNode;

import com.wat.instructions.Const;
import com.wat.instructions.Instruction;
import com.wat.instructions.Nop;
import com.wat.instructions.WasmType;
import java.util.ArrayList;
import java.util.List;

public class JVMConverter
{
    public static List<Instruction> Convert(AbstractInsnNode node)
    {
        return null;
    }
    public static List<Instruction> Convert(InsnNode node)
    {
        List<Instruction> ls = new ArrayList<>();
        switch(node.getOpcode())
        {
            case 0x00://NOP
                ls.add(new Nop());
                return ls;
            case 0x01://aconst_null
                //TODO: Figure out how to deal with null
                return ls;
            case 0x02://iconst_m1
                ls.add(new Const(WasmType.i32,-1));
                return ls;
            case 0x03://iconst_0
                ls.add(new Const(WasmType.i32,0));
                return ls;
            case 0x04://iconst_1
                ls.add(new Const(WasmType.i32,1));
                return ls;
            case 0x05://iconst_2
                ls.add(new Const(WasmType.i32,2));
                return ls;
            case 0x06://iconst_3
                ls.add(new Const(WasmType.i32,3));
                return ls;
            case 0x07://iconst_4
                ls.add(new Const(WasmType.i32,4));
                return ls;
            case 0x08://iconst_5
                ls.add(new Const(WasmType.i32,5));
                return ls;
            case 0x09://lconst_0
                ls.add(new Const(WasmType.i64,0));
                return ls;
            case 0x0a://lconst_1
                ls.add(new Const(WasmType.i64,1));
                return ls;
            case 0x0b://fconst_0
                ls.add(new Const(WasmType.f32,0));
                return ls;
            case 0x0c://fconst_1
                ls.add(new Const(WasmType.f32,1));
                return ls;
            case 0x0d://fconst_2
                ls.add(new Const(WasmType.f32,2));
                return ls;
            case 0x0e://dconst_0
                ls.add(new Const(WasmType.f64,0));
                return ls;
            case 0x0f://fconst_1
                ls.add(new Const(WasmType.f64,1));
                return ls;
            case 0x2e://iaload
                //ToDo: load an int from an array
                return ls;



        }
        return ls;
    }
}
