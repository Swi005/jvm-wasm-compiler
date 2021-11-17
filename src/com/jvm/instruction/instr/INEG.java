package com.jvm.instruction.instr;

import com.wat.instructions.Instruction;

public class INEG implements Instruction
{
    @Override
    public String getCode() {
        //TODO:THIS https://github.com/WebAssembly/design/issues/379
        return "call $ineg";
    }
}
