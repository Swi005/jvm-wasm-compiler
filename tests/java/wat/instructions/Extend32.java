package java.wat.instructions;

public class Extend32 implements Instruction {
    public final WasmType type;
    public static final String postfix = ".extend32_s";
    public String getCode() {
        return type.toString()+postfix;
    }
    public Extend32(WasmType tp)
    {
        this.type = tp;
    }
}
