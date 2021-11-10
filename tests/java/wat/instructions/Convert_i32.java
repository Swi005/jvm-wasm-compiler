package java.wat.instructions;

public class Convert_i32 implements Instruction {
    public final WasmType type;
    public final boolean isSigned;
    public static final String postfix = ".convert_i32";
    public String getCode() {
        return type.toString()+postfix;
    }
    public Convert_i32(WasmType tp,boolean isSigned)
    {
        this.isSigned = isSigned;
        this.type = tp;
    }
}
