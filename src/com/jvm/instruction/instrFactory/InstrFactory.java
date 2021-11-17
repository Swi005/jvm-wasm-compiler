package com.jvm.instruction.instrFactory;

import com.jvm.instruction.instr.*;
import com.wat.instructions.Instruction;
import org.objectweb.asm.Opcodes;

public class InstrFactory
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
                //TODO:THIS
            case Opcodes.LNEG:
                //TODO:THIS
            case Opcodes.FNEG:
                //TODO:THIS
            case Opcodes.DNEG:
                //TODO:THIS
            case Opcodes.ISHL:
                //TODO:THIS
            case Opcodes.LSHL:
                //TODO:THIS
            case Opcodes.ISHR:
                //TODO:THIS
            case Opcodes.LSHR:
                //TODO:THIS

            case Opcodes.IUSHR:
                //TODO:THIS
            case Opcodes.LUSHR:
                //TODO:THIS
            case Opcodes.IAND:
                //TODO:THIS
            case Opcodes.LAND:
                //TODO:THIS
            case Opcodes.IOR:
                //TODO:THIS
            case Opcodes.LOR:
                //TODO:THIS
            case Opcodes.IXOR:
                //TODO:THIS
            case Opcodes.LXOR:
                //TODO:THIS
            case Opcodes.I2L:
                //TODO:THIS
            case Opcodes.I2F:
                //TODO:THIS
            case Opcodes.I2D:
                //TODO:THIS

            case Opcodes.L2I:
                //TODO:THIS
            case Opcodes.L2F:
                //TODO:THIS
            case Opcodes.L2D:
                //TODO:THIS
            case Opcodes.F2I:
                //TODO:THIS
            case Opcodes.F2L:
                //TODO:THIS
            case Opcodes.F2D:
                //TODO:THIS
            case Opcodes.D2I:
                //TODO:THIS
            case Opcodes.D2L:
                //TODO:THIS
            case Opcodes.D2F:
                //TODO:THIS
            case Opcodes.I2B:
                //TODO:THIS
            case Opcodes.I2C:
                //TODO:THIS
            case Opcodes.I2S:
                //TODO:THIS

            case Opcodes.LCMP:
                //TODO:THIS
            case Opcodes.FCMPL:
                //TODO:THIS
            case Opcodes.FCMPG://TODO:THIS
            case Opcodes.DCMPL://TODO:THIS
            case Opcodes.DCMPG://TODO:THIS
            case Opcodes.IRETURN://TODO:THIS
            case Opcodes.LRETURN://TODO:THIS
            case Opcodes.FRETURN://TODO:THIS

            case Opcodes.DRETURN://TODO:THIS
            case Opcodes.ARETURN://TODO:THIS
            case Opcodes.RETURN://TODO:THIS
            case Opcodes.ARRAYLENGTH://TODO:THIS
            case Opcodes.ATHROW://TODO:THIS
            case Opcodes.MONITORENTER://TODO:THIS

            case Opcodes.MONITOREXIT://TODO:THIS
            default:
                return new NOP();
        }
    }

}
