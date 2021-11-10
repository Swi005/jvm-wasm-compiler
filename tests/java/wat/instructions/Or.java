package java.wat.instructions;

public class Or implements Instruction {
    public final WasmType type;
    public static final String postfix = ".or";
    public String getCode() {
        return type.toString()+postfix;
    }
    public Or(WasmType tp)
    {
        this.type = tp;
    }
}
