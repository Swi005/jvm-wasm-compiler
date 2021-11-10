package java.wat.instructions;

public class Unreachable implements Instruction
{
    public static final byte opCode = 0x00;
    public static final String instruction = "unreachable";

    public String getCode() {
        return instruction+"\n";
    }
}
