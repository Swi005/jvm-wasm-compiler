const fs = require('fs');
const bytes = fs.readFileSync('./bin/malloc.wasm');
const bytes2 = fs.readFileSync('./bin/array.wasm');
(async() =>{
    const malloc = await WebAssembly.instantiate(bytes);
    const array = await WebAssembly.instantiate(bytes2)

    malloc.instance.exports.init();//Initalize the memory allocator
    //WRITE TESTS HERE
    console.log(new Uint8Array(malloc.exports.heap.buffer));

});