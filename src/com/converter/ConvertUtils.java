package com.converter;

import org.objectweb.asm.tree.LocalVariableNode;

import java.util.List;

public class ConvertUtils
{
    public static LocalVariableNode resolveLocalVarIndex(int index, List<LocalVariableNode> vars)
    {
        for(LocalVariableNode var : vars)
        {
            if(var.index == index)
                return var;
        }
        return null;
    }

}
