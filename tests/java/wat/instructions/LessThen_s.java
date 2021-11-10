package java.wat.instructions;

public class LessThen_s implements Instruction{
    public final WasmType type;
    public static final String postfix = ".lt_s";
    public String getCode() {
        return type.toString()+postfix;
    }
    public LessThen_s(WasmType tp)
    {
        this.type = tp;
    }
}
