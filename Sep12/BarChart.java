import java.util.Scanner;

public class BarChart
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        String msg = "";
        int aster;

        for(int i = 1; i < 6; i++)
        {
            System.out.println("Enter number of asterisks");
            aster = input.nextInt();

            for(int j = 1; j <= aster; j++)
            {
                //System.out.print("*"); //print keeps all the same line
                msg += "*";
            }
            //System.out.println();
            msg += "\n";
        }

        System.out.println(msg);
    }
}