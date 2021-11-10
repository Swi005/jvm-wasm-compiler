package java.wat.instructions;

public class Extend16 implements Instruction {
    public final WasmType type;
    public static final String postfix = ".extend16_s";
    public String getCode() {
        return type.toString()+postfix;
    }
    public Extend16(WasmType tp)
    {
        this.type = tp;
    }
}
