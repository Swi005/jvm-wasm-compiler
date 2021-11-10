package java.wat.instructions;

import java.util.List;

public class Then implements Instruction
{
    public static final String instruction = "then";
    public final List<Instruction> instructionList;
    public Then(List<Instruction> instructionList)
    {
        this.instructionList = instructionList;
    }
    public String getCode() {
        StringBuilder str = new StringBuilder("("+instruction+"\n");
        for (Instruction i: instructionList) {
            str.append("    ").append(i.getCode());
        }
        str.append(")\n");
        return str.toString();
    }
}
