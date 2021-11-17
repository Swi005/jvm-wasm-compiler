package com.wat.instructions;

public class Call_Indirect implements Instruction {
    public static final byte opCode = 0x11;
    public static final String instruction = "call_indirect";
    public final String funcSig;
    public Call_Indirect(String sig)
    {
        this.funcSig = sig;
    }

    public String getCode() {
        return instruction+" "+funcSig+"\n";
    }
}
