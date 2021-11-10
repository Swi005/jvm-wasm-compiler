package java.wat.instructions;

public class Add implements Instruction
{
    public final WasmType type;
    public static final String postfix = ".add";
    public String getCode() {
        return type.toString()+postfix;
    }
    public Add(WasmType tp)
    {
        this.type = tp;
    }
}
