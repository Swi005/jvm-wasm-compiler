package java.converter;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;
import java.wat.instructions.Instruction;
import java.wat.instructions.Nop;

public class ConvertUtils
{
    public static List<Instruction> ConvertInstruction(int opCode)
    {
        return null;
    }

    private static List<Instruction> nop()
    {
        List<Instruction> ls = new ArrayList<Instruction>();
        ls.add(new Nop());
        return ls;
    }
    private static List<Instruction> aconst_null()
    {
        throw new NotImplementedException();
    }
}
