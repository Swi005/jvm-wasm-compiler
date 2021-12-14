package com.jvm.instruction.utilInsn;

import com.jvm.instruction.Instruction;
import com.jvm.instruction.WasmType;

public class READ implements Instruction
{
    private String loc;
    private WasmType tp;

    public READ(String loc, WasmType tp) {
        this.loc = loc;
        this.tp = tp;
    }

    @Override
    public String getWAT() {
        switch (tp)
        {
            case i32:
                return "(call $read_i32 ("+loc+"))";
            case i64:
                return "(call $read_i64 ("+loc+"))";
            case f32:
                return "(call $read_f32 ("+loc+"))";
            case f64:
                return "(call $read_f64 ("+loc+"))";
            default:
                throw new IllegalStateException();
        }
    }
}
