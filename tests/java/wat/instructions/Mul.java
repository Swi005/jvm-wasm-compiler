package java.wat.instructions;

public class Mul implements Instruction{
    public final WasmType type;
    public static final String postfix = ".mul";
    public String getCode() {
        return type.toString()+postfix;
    }
    public Mul(WasmType tp)
    {
        this.type = tp;
    }
}
