package com.jvm.instruction;

import org.objectweb.asm.Type;

/**
 * Enum for all the types in wasm
 */
public enum WasmType
{
    i32,
    i64,
    f32,
    f64,
    ref;

    public int getSize()
    {
        switch (this)
        {
            case i32:
            case f32:
            case ref:
                return 4;
            case i64:
            case f64:
                return 8;
            default:
                return 0;
        }
    }
    public static WasmType fromType(Type tp)
    {
        switch (tp.getSort())
        {
            case Type.ARRAY:
            case Type.OBJECT:
                return WasmType.ref;
            case Type.BOOLEAN:
            case Type.BYTE:
            case Type.SHORT:
            case Type.VOID:
            case Type.CHAR:
            case Type.INT:
                return WasmType.i32;
            case Type.DOUBLE:
                return WasmType.i64;
            case Type.FLOAT:
                return WasmType.f32;
            case Type.LONG:
                return WasmType.f64;
            case Type.METHOD:
            default:
                throw new IllegalStateException("Unexpected value: " + tp);
        }
    }
}
