package java.wat.instructions;

public class Neg implements Instruction {
    public final WasmType type;
    public static final String postfix = ".neg";
    public String getCode() {
        return type.toString()+postfix;
    }
    public Neg(WasmType tp)
    {
        this.type = tp;
    }
}
