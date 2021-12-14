package com.jvm.instruction.typeInsn;

import com.jvm.instruction.Instruction;

public class INSTANCEOF implements Instruction {
    private final String type;
    private final int tpID;

    public INSTANCEOF(String type) {
        this.type = type;
        tpID = type.length();//ToDo: replace with resolve type id call
    }

    @Override
    public String getWAT() {
        return "i32.const "+tpID +" \n i32.eq";
    }
}
