package com.jvm.instruction.insn;

import com.jvm.instruction.Instruction;

//TODO: IMPLEMENT THIS!!!
//Impleent a function in WASM THAT DOES THIS!
public class POP2 implements Instruction {
    @Override
    public String getCode() {
        return "call $pop2";
    }
}
