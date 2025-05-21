import java.math.*;
public class test
{
    public static void main(String args[])
    {
        int obGr = 100;
        BigInteger mult = new BigInteger("1");
        
        for(int i=1;i<=obGr;i++)
        {
            String param = String.valueOf(i);
            mult = mult.multiply(new BigInteger(param));
        }
        
        System.out.println("Mult = " + mult);
    }
}
