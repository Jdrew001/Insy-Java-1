/*
    Author: Drew Atkison
    File: BookTest
    Date: 11/06/17
 */

import javax.swing.JOptionPane;
import java.io.*;
import java.util.*;

public class BookTest
{
    public static void main(String args[])
    {
        int[] quantity = {12, 8, 3, 53, 7, 23, 14, 5};
        calculate(readFile(), quantity);
    }

    private static void calculate(Book[] bookArray, int[] quantity)
    {
        String msg = "";
        double total = 0;
        double grandTotal = 0;
        for(int b = 0; b < bookArray.length; b++)
        {
            grandTotal += (quantity[b] * bookArray[b].getPrice());
            msg += bookArray[b].createInvoice(quantity[b]);
        }

        msg += "\nGrand Total: " + String.format("$%.2f", grandTotal);
        displayResult(msg);
    }

    private static void displayResult(String msg)
    {
        JOptionPane.showMessageDialog(null, msg);
    }

    private static Book[] readFile()
    {
        Book[] bookArray = new Book[8];
        int counter = 0;
        String[] array;
        Scanner input = new Scanner(System.in);
        String line;
        try {
            input = new Scanner(new File("data.txt"));
            while(input.hasNext()) 
            {
                line = input.nextLine();
                array = line.split(";");
                if(array[0].equals("Fiction")) 
                    bookArray[counter] = new Fiction(array[1], array[2], array[5], new Publisher(array[3], array[4]), Double.parseDouble(array[6]), array[7]);
                else
                    bookArray[counter] = new NonFiction(array[1], array[2], array[5], new Publisher(array[3], array[4]), Double.parseDouble(array[6]), array[7]);
                
                array = null;
                counter++;
            }

        } catch(IOException ex) {
            ex.printStackTrace();
        }

        return bookArray;
    }
}