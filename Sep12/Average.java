import java.util.Scanner;

public class Average
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int count = 1;
        int grade;
        int total = 0;
        double average;

        /*while(count <= 5)
        {
            System.out.println("Enter grade " + count + ": ");
            grade = input.nextInt();

            total += grade;
            count++;
        }*/


        /* Do homework like this and duplicate code because she wants it like that */
        System.out.println("Enter grade " + count + ": ");
        grade = input.nextInt();
        while(grade != -1)
        {
            total += grade;
            count++;
            System.out.println("Enter grade number " + count + ": ");
            grade = input.nextInt();
        }

        average = total / (count - 1);
        System.out.println("Average Grade: " + average);
    }
}