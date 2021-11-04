const fs = require('fs');
const bytes = fs.readFileSync('./bin/malloc.wasm');
const bytes2 = fs.readFileSync('./bin/array.wasm');
console.log("UWU");

WebAssembly.instantiate(bytes).then(module => {
    var importObj = {
        malloc: {
            malloc: module.instance.exports.malloc,
            free: module.instance.exports.free,
            read_byte: module.instance.exports.read_byte,
            write_byte: module.instance.exports.write_byte,
            read_i32: module.instance.exports.read_i32,
            write_i32: module.instance.exports.write_i32,
            read_i64: module.instance.exports.read_i64,
            write_i64: module.instance.exports.write_i64,
            read_f32: module.instance.exports.read_f32,
            write_f32: module.instance.exports.write_f32,
            read_f64: module.instance.exports.read_f64,
            write_f64: module.instance.exports.write_f64,
        },
    };
    module.instance.exports.init()
    return WebAssembly.instantiate(bytes2, importObj)
}).then(module =>{
    var arLength = 5;
    var ptr = module.instance.exports.new_i32_array(arLength);

    for (let index = 0; index < arLength; index++) {
        module.instance.exports.set_elem_from_i32_array(ptr, index, 1);
    }
    
    for (let index = 0; index < arLength+12; index++) {
        console.log(module.instance.exports.get_elem_from_i32_array(ptr, index));
    }
});