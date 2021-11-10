package java.wat.instructions;

public class And implements Instruction{
    public final WasmType type;
    public static final String postfix = ".and";
    public String getCode() {
        return type.toString()+postfix;
    }
    public And(WasmType tp)
    {
        this.type = tp;
    }
}
