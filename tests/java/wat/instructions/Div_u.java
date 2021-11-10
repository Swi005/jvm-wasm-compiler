package java.wat.instructions;

public class Div_u implements Instruction {
    public final WasmType type;
    public static final String postfix = ".div_u";
    public String getCode() {
        return type.toString()+postfix;
    }
    public Div_u(WasmType tp)
    {
        this.type = tp;
    }
}
