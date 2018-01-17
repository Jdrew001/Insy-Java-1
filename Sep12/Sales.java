import java.util.Scanner;

public class Sales
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int quantity;
        double price = 0;
        double total = 0;

        for (int i = 1; i < 6; i++)
        {
            System.out.println("Enter quantity of # " + i + " sold");
            quantity = input.nextInt();

            switch(i)
            {
                case 1: price = 2.98;
                    break;
                case 2: price = 4.50;
                    break;
                case 3: price = 9.98;
                    break;
                case 4: price = 4.49;
                    break;
                case 5: price = 6.87;
                    break;
                default: System.out.println("bad item");
            }

            total += price * quantity;
        }
    }
}