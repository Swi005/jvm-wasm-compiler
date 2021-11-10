package java.wat.instructions;

public class LessThen_u implements Instruction{
    public final WasmType type;
    public static final String postfix = ".lt_u";
    public String getCode() {
        return type.toString()+postfix;
    }
    public LessThen_u(WasmType tp)
    {
        this.type = tp;
    }
}
