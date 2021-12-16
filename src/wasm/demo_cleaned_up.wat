(module $demo
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

    ;;Even more imports :(
    ;;---------------ARRAYS IMPORTS----------------
    (import "array" "get_elem_from_i32_array" (func $get_elem_from_i32_array (param i32) (param i32) (result i32)))
    (import "array" "set_elem_from_i32_array" (func $set_elem_from_i32_array (param i32) (param i32) (param i32)))
    (import "array" "new_i32_array" (func $new_i32_array(param i32)(result i32)))
    (import "array" "array_size" (func $array_size (param i32) (result i32)))


    ;;-----------CODE--------------------------------------
    (func $Foo (param $l0 i32) (local $l1 i32)
        block $0
            local.get $l0
            i32.const 2
            i32.add
            local.set $l1
        end
        block $L1
            local.get $l1
            return
        end
    )
    (export "Foo" (func $Foo))

    (func $Bar (param $l0 i32) (local $l1 i32) (local $l2 i32)
        (loop $L0
            i32.const 3
            call $new_i32_array
            i32.add
            i32.const 0
            i32.const 1
            call $set_elem_from_i32_array
            i32.add
            i32.const 1
            i32.const 2
            call $set_elem_from_i32_array
            i32.add
            i32.const 2
            i32.const 3
            call $set_elem_from_i32_array
            local.set $l0
        )
        (loop $L1
            i32.const 0
            local.set $l1
        )
        (loop $L6
            i32.const 0
            local.set $l2
        )
        (loop $L2
            local.get $l2
            local.get $l0
            call $array_size
            i32.ge_s
            ;;br_if $L5
        )
        (loop $L3
            local.get $l1
            local.get $l0
            local.get $l2
            call $get_elem_from_i32_array
            i32.add
            local.set $l1
        )
        (loop $L4
            ;;br $L2
        )
        (loop $L5
            local.get $l1
            return
        )
    )
    (export "Bar" (func $Bar))
    (func $FooBar (param $l0 i32) (local $l1 i32) (local $l2 i32))
        ()
    (export "FooBar" (func $FooBar))
)