package java.wat.instructions;

public class Store16 {
    public final WasmType type;
    public static final String postfix = ".store16";
    public String getCode() {
        return type.toString()+postfix;
    }
    public Store16(WasmType tp)
    {
        this.type = tp;
    }
}
