package com.jvm.instruction.intInsn;

import com.jvm.instruction.Instruction;
import org.objectweb.asm.Opcodes;

public class NEWARRAY implements Instruction
{
    private final int type;
    public NEWARRAY(int type)
    {
        this.type = type;
    }
    @Override
    public String getWAT() {
        switch (type)
        {
            case Opcodes.T_CHAR:
            case Opcodes.T_BYTE:
            case Opcodes.T_BOOLEAN:
                return "call $new_byte_array";
            case Opcodes.T_FLOAT:
                return "call $new_f32_array";
            case Opcodes.T_DOUBLE:
                return "call $new_f64_array";
            case Opcodes.T_INT:
            case Opcodes.T_SHORT:
                return "call $new_i32_array";
            case Opcodes.T_LONG:
                return "call $new_i64_array";
            default:
                return "unreachable";

        }
    }
}
