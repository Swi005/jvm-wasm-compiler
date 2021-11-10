package java.wat.instructions;

public class Shift_Right_s implements Instruction {
    public final WasmType type;
    public static final String postfix = ".shr_s";
    public String getCode() {
        return type.toString()+postfix;
    }
    public Shift_Right_s(WasmType tp)
    {
        this.type = tp;
    }
}
