package java.wat.instructions;

public class Drop implements Instruction{
    public static final byte opCode = 0x1A;
    public static final String instruction = "drop";

    public String getCode() {
        return instruction+"\n";
    }
}
