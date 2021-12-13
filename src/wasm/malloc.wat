;;
;;Author: Sander Wiig | sander.wiig@student.uib.no
;;
;;
(module $malloc

    (memory (export "heap") 1)
    
    ;;Start of the writable memory region
    ;; Result: start of writable memory
    (func $START_OF_MEMORY (result i32)
        i32.const 0   
    )
    ;;End of allowable memory
    ;;  Returns: End of writable memory
    (func $END_OF_MEMORY (result i32)
        i32.const 0
    )
    ;;Position of the first memory block
    ;; Returns: pointer to first block
    (func $START_BLOCK (result i32)
        call $START_OF_MEMORY
        call $HEADER_LENGTH
        i32.add
    )
    ;;Returns the length of a header
    ;;  Return: header size
    (func $HEADER_LENGTH (result i32)
        i32.const 12
    )
    ;;Return offset to length of block
    ;;  Return: offset to size of block
    (func $SIZE_OFFSET (result i32)
        i32.const 4
    )
    ;;return offset to pointer to next block
    ;;  Return: offset to the next block pointer
    (func $NEXT_BLOCK_OFFSET(result i32)
        i32.const 8
    )
    ;;Get size of the memory block at $pos
    ;;Params:
    ;; 0: Block pointer
    ;; Returns: Size of the block
    (func $get_block_size (param i32) (result i32)
        local.get 0;;Get pos
        call $HEADER_LENGTH
        i32.sub
        call $SIZE_OFFSET;;get byte where block size is stored
        i32.add;;add together to get loc in memory where size is stored
        i32.load
    )
    ;;Set the block size
    ;;Params:
    ;; 0: Block pointer
    ;; 1: the new size
    (func $set_block_size (param i32) (param $size i32)
        local.get 0
        call $HEADER_LENGTH
        i32.sub
        call $SIZE_OFFSET
        i32.add
        local.get 1
        i32.store
    )
    ;;Get pointer to next block
    ;;Params:
    ;; 0: Block pointer
    ;; Returns: pointer to next block
    (func $get_next_block (param i32) (result i32)
        local.get 0
        call $HEADER_LENGTH
        i32.sub
        call $NEXT_BLOCK_OFFSET
        i32.add
        i32.load
        return
    )
    ;;set pointer to next block
    ;;Params: 
    ;; 0: pointer to next block
    ;; 1: Block pointer
    ;; Returns: pointer to next block
    (func $set_next_block (param $ptr i32) (param i32) (result i32)
        local.get 1
        call $HEADER_LENGTH
        i32.sub
        call $NEXT_BLOCK_OFFSET
        i32.add
        local.get $ptr
        i32.store
        local.get $ptr
        return
    )
    ;;check if the block is occupied
    ;;Params:
    ;; 0: Block pointer
    ;; Returns: 0 | 1 depending on wheter or not the block is occupied or not
    (func $get_is_occupied (param i32) (result i32)
        local.get 0
        call $HEADER_LENGTH
        i32.sub
        i32.load
    )
    ;;Set if block is occupied
    ;;Params:
    ;; 0: Block pointer
    ;; 1: Is occupied
    (func $set_is_occupied (param i32) (param $is_occupied i32)
        local.get 0
        call $HEADER_LENGTH
        i32.sub
        local.get $is_occupied
        i32.store
    )
    ;;Implementation of malloc, should not be used outside this module
    ;;Params:
    ;; 0: Block to check
    ;; 1: Size of needed memory
    ;; Returns: Pointer to allocated memory
    (func $__malloc__ (param $block i32) (param $size i32) (result i32)
        local.get $block
        call $get_is_occupied
        (if
            (then ;;Block is occupied
               local.get $block
               call $get_next_block
               (if;;Check if it points to somewhere
                    (then ;;It has a next node
                        local.get $block
                        call $get_next_block
                        local.get $size
                        call $__malloc__
                        return
                    )
                    (else;;it doesnt have a next node
                        local.get $block
                        call $get_block_size
                        call $HEADER_LENGTH
                        i32.add;;total size of this block
                        local.get $block
                        i32.add;;add togeher blocksize + curpos
                        local.get $size
                        call $new_block;;Make new block with size $size
                        local.get $block 
                        call $set_next_block
                        return
                        ;;make new node
                        ;;make that block this blocks next node
                    )
               )
            )
            (else ;;Block is free
                local.get $block
                call $get_block_size
                local.get $size
                i32.ge_s
                (if
                    (then ;;Is enough space
                        local.get $block
                        i32.const 1
                        call $set_is_occupied
                        local.get $block
                        return
                    )
                    (else;;does not have enough space
                        local.get $block
                        call $get_next_block
                        (if;;Check if it points to somewhere
                            (then ;;It has a next node
                                local.get $block
                                call $get_next_block
                                local.get $size
                                call $__malloc__
                                return
                            )
                            (else;;it doesnt have a next node
                                local.get $block
                                call $get_block_size
                                call $HEADER_LENGTH
                                i32.add;;total size of this block
                                local.get $block
                                i32.add;;add together blocksize + curpos
                                local.get $size
                                call $new_block;;Make new block with size $size
                                local.get $block 
                                call $set_next_block
                                return
                                ;;make new node
                                ;;make that block this blocks next node
                            )
                        )
                    )
                )
            )
        )
        unreachable
    )
    ;;Find and reserve a memory block
    ;;Params:
    ;; 0: Block pointer
    ;; Returns: pointer to next block
    (func $malloc (param i32) (result i32)
        call $START_BLOCK
        local.get 0
        call $__malloc__
    )
    ;;Create a new memory block at pos with a size of size
    ;;TODO:: SIZE OF BLOCK NEEDS TO BE OF POWER OF TWO % 4 == 0
    (func $new_block (param $pos i32) (param $size i32) (result i32)
        local.get $pos
        i32.const 1
        call $set_is_occupied
        local.get $pos
        local.get $size
        ;;DO SIZE CALCULATION HERE!!!!!!!!!!!!!!!!!!!!!
        call $set_block_size
        local.get $pos
        return
    )
    ;;Free up the memory block at position $pos.
    ;;Params
    ;; 0:Pointer to block
    (func $free (param $pos i32)
        local.get $pos
        i32.const 0
        call $set_is_occupied
    )
    ;;Initializes the first memory block at start of memory
    ;;  Returns:Pointer to first block in memory
    (func $init (result i32)
        call $START_BLOCK
        i32.const 16
        call $new_block
        i32.const 0
        call $set_is_occupied
        call $START_BLOCK
        return
    )
;;-------------READS AND WRITES--------------------------
    ;;Writes a byte at the given location
    ;;Params:
    ;; 0: Location
    ;; 1: Value
    (func $write_byte (param i32) (param i32)
        local.get 0
        local.get 1
        i32.store8
    )
    ;;Reads a byte at a given location
    ;;Params:
    ;; 0: Location
    ;; Returns: Byte at location
    (func $read_byte (param i32) (result i32)
        local.get 0
        i32.load8_u
        return
    )
    ;;Reads an i32 at a given location
    ;;Params:
    ;; 0: Location
    ;; Returns: i32 at location
    (func $read_i32 (param i32) (result i32)
        local.get 0
        i32.load
        return
    )
    ;;Writes an i32 at the given location
    ;;Params:
    ;; 0: Location
    ;; 1: Value
    (func $write_i32 (param i32) (param i32)
        local.get 0
        local.get 1
        i32.store
    )
    ;;Reads an i64 at a given location
    ;;Params:
    ;; 0: Location
    ;; Returns: i64 at location
    (func $read_i64 (param i32) (result i64)
        local.get 0
        i64.load
        return
    )
    ;;Writes an i64 at the given location
    ;;Params:
    ;; 0: Location
    ;; 1: Value
    (func $write_i64 (param i32) (param i64)
        local.get 0
        local.get 1
        i64.store
    )
    ;;Reads an f32 at a given location
    ;;Params:
    ;; 0: Location
    ;; Returns: f32 at location
    (func $read_f32 (param i32) (result f32)
        local.get 0
        f32.load
        return
    )
    ;;Writes an i32 at the given location
    ;;Params:
    ;; 0: Location
    ;; 1: Value
    (func $write_f32 (param i32) (param f32)
        local.get 0
        local.get 1
        f32.store
    )
    ;;Reads an f64 at a given location
    ;;Params:
    ;; 0: Location
    ;; Returns: f64 at location
    (func $read_f64 (param i32) (result f64)
        local.get 0
        f64.load
        return
    )
    ;;Writes an f64 at the given location
    ;;Params:
    ;; 0: Location
    ;; 1: Value
    (func $write_f64 (param i32) (param f64)
        local.get 0
        local.get 1
        f64.store
    )
;;----------------EXPORTS------------------
    (export "malloc" (func $malloc))
    (export "free" (func $free))
    (export "init" (func $init))
    (export "write_byte" (func $write_byte))
    (export "read_byte" (func $read_byte))
    (export "write_i32" (func $write_i32))
    (export "read_i32" (func $read_i32))
    (export "write_i64" (func $write_i64))
    (export "read_i64" (func $read_i64))
    (export "write_f32" (func $write_f32))
    (export "read_f32" (func $read_f32))
    (export "write_f64" (func $write_f64))
    (export "read_f64" (func $read_f64))
)