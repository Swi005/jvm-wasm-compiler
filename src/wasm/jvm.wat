(module $jvm

    (func $ineg (param i32) (result i32)
        local.get 0
        i32.const -1
        i32.xor
        return
    )
    (export "ineg" (func $ineg))
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
)