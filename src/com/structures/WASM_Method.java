package com.structures;

import com.jvm.instruction.Instruction;
import com.jvm.instruction.WasmType;

import java.util.ArrayList;
import java.util.List;

/**
 * Class for representing methods in wasm
 */
public class WASM_Method
{
    public boolean isStatic = false;
    public boolean isPublic = true;
    public String name;
    public List<WasmType> localVars = new ArrayList<>(); //Locals
    public List<WasmType> params = new ArrayList<>(); //Func params
    public WasmType returnType; //return type
    public List<Instruction> instructions = new ArrayList<>();

    private String header()
    {
        StringBuilder str = new StringBuilder("(func $"+name+" ");

        if(!isStatic){
            str.append("(param i32 ").append("$self").append(") ");
        }
        for (int i = 0; i < params.size(); i++) {
            str.append("(param ").append(params.get(i).name()).append(" $p").append(i).append(") ");
        }
        for (int i = 0; i < localVars.size(); i++) {
            str.append("(local ").append(localVars.get(i).name()).append(" $l").append(i).append(") ");
        }
        if(returnType != null) {
            str.append("(return ").append(returnType.name()).append(") ");
        }
        return str.append("\n").toString();
    }


    public String toWAT()
    {
        StringBuilder str = new StringBuilder(this.header());

        for (Instruction i: instructions) {
            str.append(i.getWAT()+"\n");
        }
        str.append(")\n");
        if(isPublic)
            str.append("(export \"").append(name).append("\" (func $").append(name).append("))\n");
        return str.toString();
    }
}
