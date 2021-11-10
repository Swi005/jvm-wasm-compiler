package java.wat.instructions;

public class Rem_u implements Instruction {
    public final WasmType type;
    public static final String postfix = ".rem_u";
    public String getCode() {
        return type.toString()+postfix;
    }
    public Rem_u(WasmType tp)
    {
        this.type = tp;
    }
}
