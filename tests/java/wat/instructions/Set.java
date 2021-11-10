package java.wat.instructions;

public class Set implements Instruction
{
    public static final String postfix = ".set";
    public final String instruction;
    public final VarType type;
    public final String arg;
    public Set(VarType tp, String arg)
    {
        this.type =tp;
        this.arg = arg;
        this.instruction = tp.toString()+postfix;
    }

    public String getCode() {
        return instruction +" "+ arg +"\n";
    }
}
