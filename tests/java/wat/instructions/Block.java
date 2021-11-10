package java.wat.instructions;

import java.util.ArrayList;
import java.util.List;

public class Block implements Instruction
{
    public static final byte opCode = 0x02;
    public static final String instruction = "block";
    private final List<Instruction> blockInstructions = new ArrayList<Instruction>();
    public Block(List<Instruction> instr)
    {
        this.blockInstructions.addAll(instr);
    }

    public String getCode()
    {
        StringBuilder str = new StringBuilder("block: \n");
        for (Instruction i : blockInstructions)
        {
            str.append("    "+i.getCode());
        }
        str.append(new End().getCode());
        return str.toString();
    }
}
