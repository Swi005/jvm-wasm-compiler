package java.wat.instructions;

public class NotEqual implements Instruction{
    public final WasmType type;
    public static final String postfix = ".ne";
    public String getCode() {
        return type.toString()+postfix;
    }
    public NotEqual(WasmType tp)
    {
        this.type = tp;
    }
}
