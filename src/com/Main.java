package com;

import com.evaluator.ClassEvaluator;
import com.structures.WASM_Class;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.tree.ClassNode;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Main
{
    public static void main(String[] args)
    {
        String path = "target/test-classes/com/structures/HelloWorld.class";
        try {
            ClassReader cr = new ClassReader(new FileInputStream(new File(path)));
            ClassNode n = new ClassNode();
            cr.accept(n,8);
            ClassEvaluator eval = new ClassEvaluator(n);
            WASM_Class c = eval.get_Class();
            //print the class + methods
            File f = new File("bin/test.wat");
            f.createNewFile();
            WASM_Writer writer = new WASM_Writer(f, c);
            writer.write();
            writer.flush();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
