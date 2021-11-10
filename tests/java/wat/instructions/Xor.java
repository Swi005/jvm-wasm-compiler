package java.wat.instructions;

public class Xor implements Instruction {
    public final WasmType type;
    public static final String postfix = ".xor";
    public String getCode() {
        return type.toString()+postfix;
    }
    public Xor(WasmType tp)
    {
        this.type = tp;
    }
}
