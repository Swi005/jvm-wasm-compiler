package java.wat.instructions;

/**
 * Enum for all the types in wasm
 */
public enum WasmType
{
    i32,
    i64,
    f32,
    f64,
    ref,
    memory,
    table,
    elem,
    data
}