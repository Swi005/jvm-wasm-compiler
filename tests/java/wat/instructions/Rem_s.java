package java.wat.instructions;

public class Rem_s implements Instruction {
    public final WasmType type;
    public static final String postfix = ".rem_s";
    public String getCode() {
        return type.toString()+postfix;
    }
    public Rem_s(WasmType tp)
    {
        this.type = tp;
    }
}
