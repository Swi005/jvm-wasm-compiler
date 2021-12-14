package com.jvm.instruction.insn;
import com.jvm.instruction.Instruction;

public class F2I implements Instruction {
    @Override
    public String getWAT() {
        return "i32.trunc_f32_s";
    }
}
