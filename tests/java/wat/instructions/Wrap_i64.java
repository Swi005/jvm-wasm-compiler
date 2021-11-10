package java.wat.instructions;

public class Wrap_i64 implements Instruction
{
    public final WasmType type;
    public static final String postfix = ".wrap_i64";
    public String getCode() {
        return type.toString()+postfix;
    }
    public Wrap_i64(WasmType tp)
    {
        this.type = tp;
    }
}
