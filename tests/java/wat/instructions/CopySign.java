package java.wat.instructions;

public class CopySign implements Instruction{
    public final WasmType type;
    public static final String postfix = ".copysign";
    public String getCode() {
        return type.toString()+postfix;
    }
    public CopySign(WasmType tp)
    {
        this.type = tp;
    }
}
