public class Interest
{
    public static void main(String args[])
    {
        //a = p(1+r)^n
        double amount;
        double priniciple = 1000.0;
        double rate = 0.05;

        for(int year = 1; year <= 10; year++)
        {
            amount = priniciple * Math.pow((1 + rate), year);
            System.out.printf("Amount earned for year %d $%.2f\n", year, amount);
        }
    }
}