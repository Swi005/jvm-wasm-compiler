package java.wat.instructions;

public class Trunc_f64 implements Instruction {
    public final WasmType type;
    public final boolean isSigned;
    public static final String postfix = ".trunc_f64";
    public String getCode() {
        return type.toString()+postfix;
    }
    public Trunc_f64(WasmType tp,boolean isSigned)
    {
        this.isSigned = isSigned;
        this.type = tp;
    }
}