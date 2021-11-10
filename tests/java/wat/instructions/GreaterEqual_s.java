package java.wat.instructions;

public class GreaterEqual_s implements Instruction {
    public final WasmType type;
    public static final String postfix = ".ge_s";
    public String getCode() {
        return type.toString()+postfix;
    }
    public GreaterEqual_s(WasmType tp)
    {
        this.type = tp;
    }
}
