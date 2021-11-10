package java.wat.instructions;

public class Rotate_r implements Instruction {
    public final WasmType type;
    public static final String postfix = ".rotr";
    public String getCode() {
        return type.toString()+postfix;
    }
    public Rotate_r(WasmType tp)
    {
        this.type = tp;
    }
}
