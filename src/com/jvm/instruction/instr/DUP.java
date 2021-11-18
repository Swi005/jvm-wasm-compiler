package com.jvm.instruction.instr;

import com.wat.instructions.Instruction;

import java.awt.*;

public class DUP implements Instruction
{
    private int tp;
    public DUP(int tp)
    {
        //TODO:NEED TO FIGURE OUT THE TYPE
        this.tp = tp;
    }
    @Override
    public String getCode() {
        //IDEA! Check stack for what the top val is and call relevant value is

        return null;//TODO: WHAT DO HERE
    }
}
