/*
    Author: Drew Atkison
    Date: 10/11/17
    StudentID: 1001317150

    problem 6.21
*/
import java.util.Scanner;

public class Digits
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int number;
        
        //receives an int from the user
        System.out.print("Enter a number: ");
        number = input.nextInt();

        System.out.println("");
        displayDigits(number);
        System.out.println("\n");
    }

    //Method used to display the digits to the screen
    private static void displayDigits(int number)
    {
        int divider = 10000;
        int partNumber;
        int remainder = number;
        
        if(number >= 1 && number <= 99999)
        {
            while(remainder > 0)
            {
                partNumber = calculateInteger(remainder, divider);
                remainder = calculateRemainder(remainder, partNumber, divider);

                System.out.print(partNumber + " ");
            }
        } else {
            System.out.println("Please enter a number between 1 and 99999");
        }
    } 

    //Given the number that is passed in, calculate the first integer in the sequence and return it
    private static int calculateInteger(int number, int divider)
    {
        while(number/divider == 0)
        {
            divider/=10;
        }

        return number/divider;
    }

    //Passing in the remainder (or original number in the beginning of program)
    //Passing in the single 'part number' that calculate integer returns
    //Passing in the divider which equals 10000
    private static int calculateRemainder(int remainder,int partNumber, int divider)
    {
        while(remainder/divider == 0)
        {
            divider/=10;
        }
        //you want to shave the remainder
        return remainder-= (divider * partNumber);
    }
}