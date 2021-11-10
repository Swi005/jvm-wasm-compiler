package java.wat.instructions;

public class GreaterThen_u implements Instruction {
    public final WasmType type;
    public static final String postfix = ".gt_u";
    public String getCode() {
        return type.toString()+postfix;
    }
    public GreaterThen_u(WasmType tp)
    {
        this.type = tp;
    }
}
