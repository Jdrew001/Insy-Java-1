/*
    Author: Drew Atkison
    Date: 10/11/17
    StudentId: 1001317150

    Problem: 7.10
 */
import java.util.Scanner;

public class Commission
{
    private static int commission = 200;

    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int sales;
        int salary;
        int count = 0;

        double employeeSalaries[] = new double [10];
        String column[] = {
            "a)    $200-299", "b)    $300-399", 
            "c)    $400-499", "d)    $500-599", 
            "e)    $600-699", "f)    $700-799", 
            "g)    $800-899", "h)    $900-999", 
            "i)    $1000 + "
        };

        while((count) != 10)
        {
            System.out.print("Enter an employees sales: (-1) to quit ");
            sales = input.nextInt();
            employeeSalaries[count] = computeSalary(sales);

            count++;
        }

        //display in tabular format the results
        System.out.print("\nColumn  Salary    Employees\n");
        count = 0;

        for(int j = 0; j < column.length; j++)
        {
            System.out.print(column[j] + "    ");
            for(int i = 0; i < employeeSalaries.length; i++)
            {
                int category = (int)(employeeSalaries[i]/100) - 2;
                //System.out.println(category);
                if(category == j)
                {
                    count++;
                } else if(category >= 8 && j == 8)
                {
                    count++;
                }
            }

            System.out.print(count + "\n");
            count = 0;
        }
    }

    private static double computeSalary(int sales)
    {
        return (sales * 0.09) + commission;
    }
}