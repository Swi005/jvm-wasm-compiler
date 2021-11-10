package java.wat.instructions;

public class Trunc implements Instruction {
    public final WasmType type;
    public static final String postfix = ".trunc";
    public String getCode() {
        return type.toString()+postfix;
    }
    public Trunc(WasmType tp)
    {
        this.type = tp;
    }
}
