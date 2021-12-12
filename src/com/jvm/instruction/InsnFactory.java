package com.jvm.instruction;

import com.jvm.instruction.fieldInsn.GETSTATIC;
import com.jvm.instruction.fieldInsn.PUTSTATIC;
import com.jvm.instruction.insn.*;
import com.jvm.instruction.intInsn.BIPUSH;
import com.jvm.instruction.intInsn.NEWARRAY;
import com.jvm.instruction.intInsn.SIPUSH;
import com.jvm.instruction.jmpInsn.*;
import com.jvm.instruction.methodCallInsn.INVOKE;
import com.jvm.instruction.typeInsn.ANEWARRAY;
import com.jvm.instruction.typeInsn.INSTANCEOF;
import com.jvm.instruction.utilInsn.UNREACHABLE;
import com.jvm.instruction.varInsn.*;
import org.objectweb.asm.Label;
import org.objectweb.asm.Opcodes;

public class InsnFactory
{
    public static Instruction zeroOpFactory(int OPCODE)
    {
        switch (OPCODE)
        {
            //TODO: This
            case Opcodes.ACONST_NULL:
                return new ACONST_NULL();
            case Opcodes.ICONST_M1:
                return new ICONST_n(-1);
            case Opcodes.ICONST_0:
                return new ICONST_n(0);
            case Opcodes.ICONST_1:
                return new ICONST_n(1);
            case Opcodes.ICONST_2:
                return new ICONST_n(2);
            case Opcodes.ICONST_3:
                return new ICONST_n(3);
            case Opcodes.ICONST_4:
                return new ICONST_n(4);
            case Opcodes.ICONST_5:
                return new ICONST_n(5);
            case Opcodes.LCONST_0:
                return new LCONST_n(0);
            case Opcodes.LCONST_1:
                return new LCONST_n(1);
            case Opcodes.FCONST_0:
                return new FCONST_n(0);
            case Opcodes.FCONST_1:
                return new FCONST_n(1);
            case Opcodes.FCONST_2:
                return new FCONST_n(2);
            case Opcodes.DCONST_0:
                return new DCONST_n(0);
            case Opcodes.DCONST_1:
                return new DCONST_n(1);
            case Opcodes.IALOAD:
            case Opcodes.SALOAD:
            case Opcodes.AALOAD:
                return new IALOAD();
            case Opcodes.LALOAD:
                return new LALOAD();
            case Opcodes.FALOAD:
                return new FALOAD();
            case Opcodes.DALOAD:
                return new DALOAD();
            case Opcodes.BALOAD:
            case Opcodes.CALOAD:
                return new BALOAD();
            case Opcodes.IASTORE:
            case Opcodes.SASTORE:
            case Opcodes.AASTORE:
                return new IASTORE();
            case Opcodes.LASTORE:
                return new LASTORE();
            case Opcodes.FASTORE:
                return new FASTORE();
            case Opcodes.DASTORE:
                return new DASTORE();
            case Opcodes.BASTORE:
            case Opcodes.CASTORE:
                return new BASTORE();
            case Opcodes.POP:
                return new POP();
            case Opcodes.POP2:
                return new POP2();
            case Opcodes.DUP:
                //TODO:This
            case Opcodes.DUP_X1:
                //TODO:This
            case Opcodes.DUP_X2:
                //TODO:This
            case Opcodes.DUP2:
                //TODO:This
            case Opcodes.DUP2_X1:
                //TODO:This
            case Opcodes.DUP2_X2:
                //TODO:This
            case Opcodes.SWAP:
                //TODO:This
            case Opcodes.IADD:
                return new IADD();
            case Opcodes.LADD:
                return new LADD();
            case Opcodes.FADD:
                return new FADD();
            case Opcodes.DADD:
                return new DADD();
            case Opcodes.ISUB:
                return new ISUB();
            case Opcodes.LSUB:
                return new LSUB();
            case Opcodes.FSUB:
                return new FSUB();
            case Opcodes.DSUB:
                return new DSUB();

            case Opcodes.IMUL:
                return new IMUL();
            case Opcodes.LMUL:
                return new LMUL();
            case Opcodes.FMUL:
                return new FMUL();
            case Opcodes.DMUL:
                return new DMUL();
            case Opcodes.IDIV:
                return new IDIV();
            case Opcodes.LDIV:
                return new LDIV();
            case Opcodes.FDIV:
                return new FDIV();
            case Opcodes.DDIV:
                return new DDIV();
            case Opcodes.IREM:
                return new IREM();
            case Opcodes.LREM:
                return new LREM();

            case Opcodes.FREM:
                return new FREM();
            case Opcodes.DREM:
                return new DREM();
            case Opcodes.INEG:
                return new INEG();
            case Opcodes.LNEG:
                return new LNEG();
            case Opcodes.FNEG:
                return new FNEG();
            case Opcodes.DNEG:
                return new DNEG();
            case Opcodes.ISHL:
                return new ISHL();
            case Opcodes.LSHL:
                return new LSHL();
            case Opcodes.ISHR:
                return new ISHR();
            case Opcodes.LSHR:
                return new LSHR();

            case Opcodes.IUSHR:
                return new IUSHR();
            case Opcodes.LUSHR:
                return new LUSHR();
            case Opcodes.IAND:
                return new IAND();
            case Opcodes.LAND:
                return new LAND();
            case Opcodes.IOR:
                return new IOR();
            case Opcodes.LOR:
                return new LOR();
            case Opcodes.IXOR:
                return new IXOR();
            case Opcodes.LXOR:
                return new LXOR();
            case Opcodes.I2L:
                return new I2L();
            case Opcodes.I2F:
                return new I2F();
            case Opcodes.I2D:
                return new I2D();

            case Opcodes.L2I:
                return new L2I();
            case Opcodes.L2F:
                return new L2F();
            case Opcodes.L2D:
                return new L2D();
            case Opcodes.F2I:
                return new F2I();
            case Opcodes.F2L:
                return new F2L();
            case Opcodes.F2D:
                return new F2D();
            case Opcodes.D2I:
                return new D2I();
            case Opcodes.D2L:
                return new D2L();
            case Opcodes.D2F:
                return new D2F();
            case Opcodes.I2B:
            case Opcodes.I2C:
            case Opcodes.I2S:
                return new NOP();

            case Opcodes.LCMP:
                return new LCMP();
            case Opcodes.FCMPL:
                return new FCMPL();
            case Opcodes.FCMPG:
                return new FCMPG();
            case Opcodes.DCMPL:
                return new DCMPL();
            case Opcodes.DCMPG:
                return new DCMPG();
            case Opcodes.IRETURN:
            case Opcodes.LRETURN:
            case Opcodes.FRETURN:
            case Opcodes.DRETURN:
            case Opcodes.ARETURN:
            case Opcodes.RETURN:
                return new RETURN();
            case Opcodes.ARRAYLENGTH:
                return new ARRAYLENGTH();
            case Opcodes.ATHROW:
                return new UNREACHABLE();
            default:
                System.err.println("ERROR: OPCODE: " + OPCODE +" IS NOT A ZERO OP INSTRUCTION");
            throw new IllegalStateException();
        }
    }
    public static Instruction intInsnFactory(int OPCODE, int operand)
    {
        switch (OPCODE)
        {
            case Opcodes.BIPUSH:
                return new BIPUSH((byte)operand);
            case Opcodes.SIPUSH:
                return new SIPUSH((short)operand);
            case Opcodes.NEWARRAY:
                return new NEWARRAY(operand);
            default:
                System.err.println("ERROR: OPCODE: " + OPCODE +" IS NOT A INT INSTRUCTION");
            throw new IllegalStateException();
        }
    }
    public static Instruction jmpInsnFactory(int OPCODE, Label label)
    {
        switch (OPCODE)
        {
            case Opcodes.IFEQ:
            case Opcodes.IFNULL:
                return new IFEQ(label);
            case Opcodes.IFNE:
            case Opcodes.IFNONNULL:
                return new IFNE(label);
            case Opcodes.IFLT:
                return new IFLT(label);
            case Opcodes.IFGE:
                return new IFGE(label);
            case Opcodes.IFGT:
                return new IFGT(label);
            case Opcodes.IFLE:
                return new IFLE(label);
            case Opcodes.IF_ACMPEQ:
            case Opcodes.IF_ICMPEQ:
                return new IF_ICMPEQ(label);
            case Opcodes.IF_ICMPNE:
            case Opcodes.IF_ACMPNE:
                return new IF_ICMPNE(label);
            case Opcodes.IF_ICMPLT:
                return new IF_ICMPLT(label);
            case Opcodes.IF_ICMPGE:
                return new IF_ICMPGE(label);
            case Opcodes.IF_ICMPGT:
                return new IF_ICMPGT(label);
            case Opcodes.IF_ICMPLE:
                return new IF_ICMPLE(label);
            case Opcodes.GOTO:
                return new GOTO(label);
            case Opcodes.JSR:
                System.err.println("ERROR JSR IS A DEPRECATED INSTRUCTION" );
            default:
                System.err.println("ERROR: OPCODE: " + OPCODE +" IS NOT A JMP INSTRUCTION");
            throw new IllegalStateException();
        }
    }
    public static Instruction varInsnFactory(int OPCODE, int var)
    {
        switch(OPCODE)
        {
            case Opcodes.ILOAD:
            case Opcodes.LLOAD:
            case Opcodes.FLOAD:
            case Opcodes.DLOAD:
            case Opcodes.ALOAD:
                return new LOAD(var);
            case Opcodes.ISTORE:
            case Opcodes.LSTORE:
            case Opcodes.FSTORE:
            case Opcodes.DSTORE:
            case Opcodes.ASTORE:
                return new STORE(var);
            case Opcodes.RET:
            default: System.err.println("ERROR: OPCODE: " + OPCODE +" IS NOT A VARIABLE INSTRUCTION");
            throw new IllegalStateException();

        }

    }
    public static Instruction typeInsnFactory(int OPCODE, String type)
    {
        switch(OPCODE){
            case Opcodes.NEW://TODO:THIS
            case Opcodes.ANEWARRAY:
                return new ANEWARRAY(type);
            case Opcodes.CHECKCAST://TODO:THIS
            case Opcodes.INSTANCEOF:
                return new INSTANCEOF(type);
            default: System.err.println("ERROR: OPCODE: " + OPCODE +" IS NOT A TYPE INSTRUCTION");
            throw new IllegalStateException();
        }
    }
    public static Instruction fieldInsnFactory(int OPCODE, String name)
    {
        switch(OPCODE){
            case Opcodes.GETSTATIC:
                return new GETSTATIC(name);
            case Opcodes.PUTSTATIC:
                return new PUTSTATIC(name);
            case Opcodes.GETFIELD://TODO:THIS
            case Opcodes.PUTFIELD://TODO:THIS
            default: System.err.println("ERROR: OPCODE: " + OPCODE +" IS NOT A FIELD INSTRUCTION");
            throw new IllegalStateException();
        }
    }
    public static Instruction methodCallInsnFactory(int OPCODE, String methodName)
    {
        switch (OPCODE){
            case Opcodes.INVOKEVIRTUAL:
            case Opcodes.INVOKESPECIAL:
            case Opcodes.INVOKESTATIC:
            case Opcodes.INVOKEINTERFACE:
                return new INVOKE(methodName);
            default: System.err.println("ERROR: OPCODE: " + OPCODE +" IS NOT A METHOD CALL INSTRUCTION");
            throw new IllegalStateException();
        }
    }
    public static Instruction LdcInsnFactory(Object value)
    {
        if(value instanceof Integer)
            return new ICONST_n((Integer) value);
        if(value instanceof Float)
            return new FCONST_n((Float) value);
        if(value instanceof Long)
            return new LCONST_n((Long) value);
        if(value instanceof Double)
            return new DCONST_n((Double) value);
        if(value instanceof String)
            throw new IllegalArgumentException("Error, strings are not implemented yet");
        throw new IllegalStateException();
    }
}
