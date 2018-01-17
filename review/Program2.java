import java.util.Scanner;

public class Program2 
{
    public void main(String args[])
    {
        double numbers = 0.0;
        double total = 0.0;
        int count = 0;
        Scanner input = new Scanner(System.in);
        /*While loop */
        while(count < 5)
        {
            numbers = input.nextDouble();
            total += numbers;
            count++;
        }

        System.out.println("Total: " + total);
        total = 0;

        /*for loop*/
        for(int i = 0; i < 5; i++)
        {
            numbers = input.nextDouble();
            total += numbers;
        }

        System.out.println("Total: " + total);
    }
}