package com;

import com.structures.WASM_Class;
import com.structures.WASM_Method;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WASM_Writer extends FileWriter {

    WASM_Class wasm_class;
    public WASM_Writer(String fileName, WASM_Class wasm_class) throws IOException {
        super(new File(fileName),true);
        this.wasm_class =wasm_class;
    }
    public WASM_Writer(File file, WASM_Class wasm_class) throws IOException {
        super(file,true);
        this.wasm_class =wasm_class;
    }

    public void write() throws IOException {
        //TODO: PRINT DEPENCENCIES!
        for (WASM_Method m: wasm_class.methods) {
            System.out.print(m.toWAT());
            this.write(m.toWAT());
        }
    }
}
