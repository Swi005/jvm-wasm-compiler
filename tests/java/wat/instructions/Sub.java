package java.wat.instructions;

public class Sub implements Instruction{
    public final WasmType type;
    public static final String postfix = ".sub";
    public String getCode() {
        return type.toString()+postfix;
    }
    public Sub(WasmType tp)
    {
        this.type = tp;
    }
}
