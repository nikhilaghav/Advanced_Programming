//Input:my name is amit
// output: ym eman si tima

import java.util.*;

class program748
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter string:");
        String str = sobj.nextLine();

        StringX strobj = new StringX();

        String sret = strobj.WordReverse(str);

        System.out.println(sret);
    }
}

class StringX
{
    public String WordReverse(String str)
    {
        str = str.trim();

        str = str.replaceAll("\\s+", " ");

        String Tokens[] = str.split(" ");

        StringBuffer sb = null;
        StringBuffer Finalstr = new StringBuffer("");

        for(int i = 0; i < Tokens.length; i++)
        {
            sb = new StringBuffer(Tokens[i]);
            sb = sb.reverse();
            Finalstr = Finalstr.append(sb);
            Finalstr = Finalstr.append(" ");
        }

        String output = new String(Finalstr);
        
        output = output.trim();

        return output;
    }

}

