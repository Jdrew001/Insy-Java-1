/*
    Author: Drew Atkison
    File: BookTest
    Date: 11/06/17
 */

import javax.swing.JOptionPane;
public class BookTest
{
    public static void main(String args[])
    {
        int[] quantity = {12, 8, 3, 53, 7, 23, 14, 5};
        String[][] books = {
            {"Fiction", "Abaham Lincoln Vampire Hunter", "Grahame-Smith", "Wiley", "NY", "978-0446563079", "13.99", "222"},
            {"Fiction", "Frankenstein", "Shelley", "Prescott", "GA", "978-0486282114", "7.99", "321"},
            {"NonFiction", "Life of Kennedy", "Jones", "Pearson", "MT", "758-29304566", "12.90", "biography"},
            {"Fiction", "Dracula", "Stoker", "Addison", "CA", "978-0486411095", "5.99", "145"},
            {"Fiction", "Curse of the Wolfman", "Hageman", "Wesley", "MA", "B00381AKHG", "10.59", "876"},
            {"NonFiction", "How to Pass Java", "Willis", "Wiley", "NY", "444-395869790", "1.99", "technology"},
            {"Fiction", "The Mummy", "Rice", "Addision", "CA", "978-0345369949", "7.99", "954"},
            {"NonFiction", "History of Texas", "Smith", "Prescott", "CA", "123-683947687", "9.75", "history"}
        };
        calculate(createBooks(books), quantity);

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

    private static Book[] createBooks(String[][] books)
    {
        Book[] bookArray = new Book[8];

        for(int i = 0; i < books.length; i++)
        {
            //Check to see if book is fiction or non fiction
            if(books[i][0].equals("Fiction")) //fiction
                bookArray[i] = new Fiction(books[i][1], books[i][2], books[i][5], new Publisher(books[i][3], books[i][4]), Double.parseDouble(books[i][6]), books[i][7]);
            else //nonfiction
                bookArray[i] = new NonFiction(books[i][1], books[i][2], books[i][5], new Publisher(books[i][3], books[i][4]), Double.parseDouble(books[i][6]), books[i][7]);
        }

        return bookArray;
    }
}