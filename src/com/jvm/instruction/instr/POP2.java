package com.jvm.instruction.instr;

import com.wat.instructions.Instruction;

//TODO: IMPLEMENT THIS!!!
//Impleent a function in WASM THAT DOES THIS!
public class POP2 implements Instruction {
    @Override
    public String getCode() {
        return "call $pop2";
    }
}
