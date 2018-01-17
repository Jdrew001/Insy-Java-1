public class IntCatch
{
    public static void main(String args[])
    {
        int number = -1;
        testing(number);
        
    }

    public static void testing(int number)
    {
        if(number < 0)
        {
            throw new ArithmeticException("False nigga");
        }
    }
}