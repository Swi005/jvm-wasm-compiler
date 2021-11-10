package java.wat.instructions;

import jdk.internal.org.objectweb.asm.tree.InsnNode;

public class Load16 implements Instruction {
    public final WasmType type;
    public static final String postfix = ".load16";
    public String getCode() {
        return type.toString()+postfix;
    }
    public Load16(WasmType tp)
    {
        this.type = tp;
    }
}
