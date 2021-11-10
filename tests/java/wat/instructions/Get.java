package java.wat.instructions;

public class Get implements Instruction
{
    public static final String postfix = ".get";
    public final String instruction;
    public final VarType type;
    public final String arg;
    public Get(VarType tp, String arg)
    {
        this.type =tp;
        this.arg = arg;
        this.instruction = tp.toString()+postfix;
    }

    public String getCode() {
        return instruction+" "+arg;
    }
}
