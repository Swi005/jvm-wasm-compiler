package java.wat.instructions;

public class Equality implements Instruction{
    public final WasmType type;
    public static final String postfix = ".eq";
    public String getCode() {
        return type.toString()+postfix;
    }
    public Equality(WasmType tp)
    {
        this.type = tp;
    }
}
