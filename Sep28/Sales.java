/*
    Array example
*/

import java.util.Scanner;

public class Sales {

    public static void main(String args[]) {
        double totalSales;
        double taxes;
        double salesArray[] = new double[7];

        readSales(salesArray);
        doubleNumber(salesArray[5]);

        for(int i = 0; i < salesArray.length; i++)
            System.out.println(salesArray[i]);

        totalSales = addSales(salesArray);
        taxes = calculatedTaxes(totalSales);

        System.out.println("Sales " + totalSales);
        System.out.println("Taxes " + taxes);

    }

    public static void doubleNumber(double n)
    {
        n = 20;
    }

    public static void readSales(double[] s)
    {
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < s.length; i++)
        {
            System.out.println("Enter sales");
            s[i] = input.nextDouble();
        }
    }

    public static double addSales(double[] s)
    {
        double total = 0;
        for(int i = 0; i <s.length; i++)
        {
            total += s[i];
        }

        return total;
    }

    public static double calculatedTaxes(double totalTaxes)
    {
        return totalTaxes * .8;
    }
}