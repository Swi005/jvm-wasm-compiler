package java.wat.instructions;

public class Floor implements Instruction{
    public final WasmType type;
    public static final String postfix = ".floor";
    public String getCode() {
        return type.toString()+postfix;
    }
    public Floor(WasmType tp)
    {
        this.type = tp;
    }
}
