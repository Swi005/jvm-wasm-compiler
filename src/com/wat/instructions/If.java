package com.wat.instructions;

public class If implements Instruction
{
    public static final byte opCode = 0x04;
    public static final String instruction = "if";
    public final Then then;
    public final Else anElse;
    public If(Then then, Else anElse)
    {
        this.then = then;
        this.anElse = anElse;
    }
    public String getCode() {
        StringBuilder str = new StringBuilder("(").append(instruction).append("\n");
        str.append("    ").append(then.getCode());
        str.append("    ").append(anElse.getCode());
        str.append(")\n");
        return str.toString();
    }
}
