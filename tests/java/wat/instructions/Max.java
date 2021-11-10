package java.wat.instructions;

public class Max implements Instruction {
    public final WasmType type;
    public static final String postfix = ".max";
    public String getCode() {
        return type.toString()+postfix;
    }
    public Max(WasmType tp)
    {
        this.type = tp;
    }
}
