package java.wat.instructions;

public class Branch_If implements Instruction{
    public static final byte opCode = 0x0D;
    public static final String instruction = "br_if";
    public final String tag;
    public Branch_If(String name)
    {
        this.tag = name;
    }

    public String getCode() {
        return instruction+tag+"\n";
    }
}
