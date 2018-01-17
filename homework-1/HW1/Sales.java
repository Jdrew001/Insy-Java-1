/*
    Author: Drew Atkison
    Date: September 13, 2017
    Problem 3
 */

public class Sales
{
    public static void main(String args[]) 
    {
        double sales = 4600000;
        double percentage = .62;
        double result = sales * percentage;

        System.out.printf("The prediction with 4.6 million sales: $%.2f", result);
    }
}