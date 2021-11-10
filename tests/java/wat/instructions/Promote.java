package java.wat.instructions;

public class Promote implements Instruction{
    public final WasmType type;
    public static final String postfix = ".demote_f32";
    public String getCode() {
        return type.toString()+postfix;
    }
    public Promote(WasmType tp)
    {
        this.type = tp;
    }
}
