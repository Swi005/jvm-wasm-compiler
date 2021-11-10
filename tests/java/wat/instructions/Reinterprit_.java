package java.wat.instructions;

public class Reinterprit_ implements Instruction {
    public final WasmType type;
    public final WasmType targetType;
    public static final String postfix = ".reinterprit_";
    public String getCode() {
        return type.toString()+postfix+targetType.toString();
    }
    public Reinterprit_(WasmType tp, WasmType tp2)
    {
        this.type = tp;
        this.targetType = tp2;
    }
}
