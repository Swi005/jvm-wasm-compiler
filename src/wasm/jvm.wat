(module $jvm
    ;;----MEMORY ALLOCATOR IMPORTS----
    (import "malloc" "malloc" (func $malloc (param i32) (result i32)))
    (import "malloc" "free" (func $free (param i32)))
    
    ;;----READ/WRITE FUNCTIONS-----
    ;;Bytes
    (import "malloc" "read_byte" (func $read_byte (param i32) (result i32)))
    (import "malloc" "write_byte" (func $write_byte (param i32) (param i32)))
    ;;Ints
    (import "malloc" "read_i32" (func $read_i32 (param i32) (result i32)))
    (import "malloc" "write_i32" (func $write_i32 (param i32) (param i32)))
    (import "malloc" "read_i64" (func $read_i64 (param i32) (result i64)))
    (import "malloc" "write_i64" (func $write_i64 (param i32) (param i64)))
    ;;Floats
    (import "malloc" "read_f32" (func $read_f32 (param i32) (result f32)))
    (import "malloc" "write_f32" (func $write_f32 (param i32) (param f32)))
    (import "malloc" "read_f64" (func $read_f64 (param i32) (result f64)))
    (import "malloc" "write_f64" (func $write_f64 (param i32) (param f64)))

    (func $ineg (param i32) (result i32)
        local.get 0
        i32.const -1
        i32.xor
        return
    )
    (export "ineg" (func $ineg))
    (func $lneg (param i64) (result i64)
        local.get 0
        i64.const -1
        i64.xor
        return
    )
    (export "lneg" (func $lneg))
    

    (func $i32_dup (param i32) (result i32) (result i32)
        local.get 0
        local.get 0
        return
    )
    (func $f32_dup (param f32) (result f32) (result f32)
        local.get 0
        local.get 0
        return
    )
    (export "f32_dup" (func $f32_dup))
    (func $i64_dup (param i64) (result i64) (result i64)
        local.get 0
        local.get 0
        return
    )
    (export "i64_dup" (func $i64_dup))
    (func $f64_dup (param f64) (result f64) (result f64)
        local.get 0
        local.get 0
        return
    )
    (export "f64_dup" (func $f64_dup))

    (func $get_object_type (param i32 $referance) (result i32)
        local.get $referance
        call $read_i32
        return
    )
    (export "i64_dup" (func $i64_dup))
)