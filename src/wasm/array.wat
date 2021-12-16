;;
;;Author: Sander Wiig | sander.wiig@student.uib.no
;;
;;
(module $array

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
    


;;-----------------------ARRAY UTILS---------------------------------------------;;

    ;;Gets size of array
    ;;Params:
    ;; 0:location of array
    ;; Return: num of elems in the array
    (func $array_size (param i32) (result i32)
        local.get 0
        call $read_i32
        return
    )
    (export "array_size" (func $array_size))
;;----------------------BYTE ARRAYS------------------------------------------------;;    
    ;;Makes a new byte array
    ;;Params:
    ;; 0:number of elems in array
    ;; Return: Pointer to array
    (func $new_byte_array(param i32)(result i32)
        (local $tmp i32)
        local.get 0;;push arg 0 to stack
        i32.const 4;;Add header
        i32.add
        call $malloc ;;allocate memory
        local.tee $tmp;;set 
        local.get 0
        call $write_i32
        local.get $tmp
        return  ;;return pointer 
    )
    (export "new_byte_array" (func $new_byte_array))
    ;;Gets element from the byte array
    ;;Params:
    ;; 0: Location of array
    ;; 1: Index of element
    ;; Result: The element at the given index
    (func $get_elem_from_byte_array (param i32) (param i32) (result i32)
        local.get 0
        local.get 1
        i32.const 4;;Header offset
        i32.add
        i32.add
        call $read_byte
        return
    )
    (export "get_elem_from_byte_array" (func $get_elem_from_byte_array))
    ;;Gets element from the byte array
    ;;Params:
    ;; 0: Location of array
    ;; 1: Index of element
    ;; 2: New value
    (func $set_elem_from_byte_array (param i32) (param i32) (param i32)
        local.get 0
        local.get 1
        i32.const 4;;Header offset
        i32.add
        i32.add
        local.get 2
        call $write_byte
    )
    (export "set_elem_from_byte_array" (func $set_elem_from_byte_array))
;;---------------------I32 ARRAYS-----------------------------------------------

    ;;Makes a new i32 array
    ;;Params:
    ;; 0:number of elems in array
    ;; Return: Pointer to array
    (func $new_i32_array(param i32)(result i32)
        (local $tmp i32)
        local.get 0;;push arg 0 to stack
        i32.const 4;;length of an i32
        i32.mul;;multiplt to get real needed size
        i32.const 4;;Add header
        i32.add
        call $malloc ;;allocate memory
        local.tee $tmp;;set 
        local.get 0
        call $write_i32
        local.get $tmp
        return  ;;return pointer 
    )
    (export "new_i32_array" (func $new_i32_array))
    ;;Gets element from the i32 array
    ;;Params:
    ;; 0: Location of array
    ;; 1: Index of element
    ;; Result: The element at the given index
    (func $get_elem_from_i32_array (param i32) (param i32) (result i32)
        local.get 0;;
        local.get 1;;load index
        i32.const 4;;length of i32
        i32.mul;;multiply to get real index
        i32.add;;add to loc
        call $read_i32;;read
        return
    )
    (export "get_elem_from_i32_array" (func $get_elem_from_i32_array))
    ;;sets element from the i32 array
    ;;Params:
    ;; 0: Location of array
    ;; 1: Index of element
    ;; 2: New value
    (func $set_elem_from_i32_array (param i32) (param i32) (param i32)
        local.get 0
        local.get 1
        i32.const  4
        i32.mul
        i32.add
        local.get 2
        call $write_i32
    )
    (export "set_elem_from_i32_array" (func $set_elem_from_i32_array))
;;---------------------i64 ARRAYS-----------------------------------------------

    ;;Makes a new i64 array
    ;;Params:
    ;; 0:number of elems in array
    ;; Return: Pointer to array
    (func $new_i64_array(param i32)(result i32)
        (local $tmp i32)
        local.get 0;;push arg 0 to stack
        i32.const 8;;length of an i64
        i32.mul;;multiplt to get real needed size
        i32.const 4;;Add header
        i32.add
        call $malloc ;;allocate memory
        local.tee $tmp;;set 
        local.get 0
        call $write_i32
        local.get $tmp
        return  ;;return pointer 
    )
    (export "new_i64_array" (func $new_i64_array))
    ;;Gets element from the i64 array
    ;;Params:
    ;; 0: Location of array
    ;; 1: Index of element
    ;; Result: The element at the given index
    (func $get_elem_from_i64_array (param i32) (param i32) (result i64)
        local.get 0;;
        local.get 1;;load index
        i32.const 8;;length of i64
        i32.mul;;multiply to get real index
        i32.add;;add to loc
        call $read_i64;;read
        return
    )
    (export "get_elem_from_i64_array" (func $get_elem_from_i64_array))
    ;;sets element from the i64 array
    ;;Params:
    ;; 0: Location of array
    ;; 1: Index of element
    ;; 2: New value
    (func $set_elem_from_i64_array (param i32) (param i32) (param i64)
        local.get 0
        local.get 1
        i32.const 8
        i32.mul
        i32.add
        local.get 2
        call $write_i64
    )
    (export "set_elem_from_i64_array" (func $set_elem_from_i64_array))

;;---------------------f32 ARRAYS-----------------------------------------------

    ;;Makes a new f32 array
    ;;Params:
    ;; 0:number of elems in array
    ;; Return: Pointer to array
    (func $new_f32_array(param i32)(result i32)
        (local $tmp i32)
        local.get 0;;push arg 0 to stack
        i32.const 4;;length of an f32
        i32.mul;;multiplt to get real needed size
        i32.const 4;;Add header
        i32.add
        call $malloc ;;allocate memory
        local.tee $tmp;;set 
        local.get 0
        call $write_i32
        local.get $tmp
        return  ;;return pointer 
    )
    (export "new_f32_array" (func $new_f32_array))
    ;;Gets element from the f32 array
    ;;Params:
    ;; 0: Location of array
    ;; 1: Index of element
    ;; Result: The element at the given index
    (func $get_elem_from_f32_array (param i32) (param i32) (result f32)
        local.get 0;;
        local.get 1;;load index
        i32.const 4;;length of f32
        i32.mul;;multiply to get real index
        i32.add;;add to loc
        call $read_f32;;read
        return
    )
    (export "get_elem_from_f32_array" (func $get_elem_from_f32_array))
    ;;sets element from the f32 array
    ;;Params:
    ;; 0: Location of array
    ;; 1: Index of element
    ;; 2: New value
    (func $set_elem_from_f32_array (param i32) (param i32) (param f32)
        local.get 0
        local.get 1
        i32.const  4
        i32.mul
        i32.add
        local.get 2
        call $write_f32
    )
    (export "set_elem_from_f32_array" (func $set_elem_from_f32_array))
;;---------------------f64 ARRAYS-----------------------------------------------

    ;;Makes a new f64 array
    ;;Params:
    ;; 0:number of elems in array
    ;; Return: Pointer to array
    (func $new_f64_array(param i32)(result i32)
        (local $tmp i32)
        local.get 0;;push arg 0 to stack
        i32.const 8;;length of an f64
        i32.mul;;multiplt to get real needed size
        i32.const 4;;Add header
        i32.add
        call $malloc ;;allocate memory
        local.tee $tmp;;set 
        local.get 0
        call $write_i32
        local.get $tmp
        return  ;;return pointer 
    )
    (export "new_f64_array" (func $new_f64_array))
    ;;Gets element from the f64 array
    ;;Params:
    ;; 0: Location of array
    ;; 1: Index of element
    ;; Result: The element at the given index
    (func $get_elem_from_f64_array (param i32) (param i32) (result f64)
        local.get 0;;
        local.get 1;;load index
        i32.const 8;;length of f64
        i32.mul;;multiply to get real index
        i32.add;;add to loc
        call $read_f64;;read
        return
    )
    (export "get_elem_from_f64_array" (func $get_elem_from_f64_array))
    ;;sets element from the f64 array
    ;;Params:
    ;; 0: Location of array
    ;; 1: Index of element
    ;; 2: New value
    (func $set_elem_from_f64_array (param i32) (param i32) (param f64)
        local.get 0
        local.get 1
        i32.const 8
        i32.mul
        i32.add
        local.get 2
        call $write_f64
    )
    (export "set_elem_from_f64_array" (func $set_elem_from_f64_array))
)