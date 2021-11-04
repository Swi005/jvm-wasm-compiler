const fs = require('fs');
const bytes = fs.readFileSync('./bin/malloc.wasm');

(async () =>{
    const { instance, module } = await WebAssembly.instantiate(bytes);
    instance.exports.init();
    console.log(new Uint8Array(instance.exports.heap.buffer));
    instance.exports.malloc(12);
    console.log(new Uint8Array(instance.exports.heap.buffer));
    var ptr = instance.exports.malloc(24);
    console.log(new Uint8Array(instance.exports.heap.buffer));
    instance.exports.free(ptr);
    console.log(new Uint8Array(instance.exports.heap.buffer));

})();