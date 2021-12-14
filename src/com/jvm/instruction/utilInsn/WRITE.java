package com.jvm.instruction.utilInsn;

import com.jvm.instruction.Instruction;
import com.jvm.instruction.WasmType;

public class WRITE implements Instruction
{
    private String loc;
    private WasmType tp;
    private String val;

    public WRITE(String loc, WasmType tp, String val) {
        this.loc = loc;
        this.tp = tp;
        this.val = val;
    }

    @Override
    public String getWAT() {
        switch (tp)
        {
            case i32:
                return "(call $write_i32 ("+loc+") ("+val+"))";
            case i64:
                return "(call $write_i64 ("+loc+")("+val+"))";
            case f32:
                return "(call $write_f32 ("+loc+")("+val+"))";
            case f64:
                return "(call $write_f64 ("+loc+")("+val+"))";
            default:
                throw new IllegalStateException();
        }
    }
}
