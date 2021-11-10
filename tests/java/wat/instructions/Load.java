package java.wat.instructions;

public class Load implements Instruction
{
    public final WasmType type;
    public static final String postfix = ".load";
    public String getCode() {
        return type.toString()+postfix;
    }
    public Load(WasmType tp)
    {
        this.type = tp;
    }
}
