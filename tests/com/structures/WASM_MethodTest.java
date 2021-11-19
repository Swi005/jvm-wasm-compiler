package com.structures;

import org.junit.jupiter.api.Test;

import com.jvm.instruction.WasmType;
import java.util.ArrayList;
import java.util.List;

public class WASM_MethodTest
{
    @Test
    void TestHeader() {
        WASM_Method m = new WASM_Method();
        m.isPublic = true;
        m.isStatic = false;
        m.returnType = WasmType.i32;
        m.name = "Test_Method";
        List<WasmType> params = new ArrayList<>();
        params.add(WasmType.i32);
        params.add(WasmType.i64);
        m.params = params;
        List<WasmType> locals = new ArrayList<>();
        locals.add(WasmType.f32);
        locals.add(WasmType.i32);
        m.localVars = locals;
        System.out.println(m.toWAT());
    }
}