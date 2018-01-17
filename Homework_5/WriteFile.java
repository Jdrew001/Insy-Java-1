import java.io.File;
import java.util.Formatter;
import java.io.IOException;

public class WriteFile 
{

    public static void main(String args[])
    {
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
        try {
            Formatter output = new Formatter(new File("data.txt"));

            for(int i = 0; i < books.length; i++)
            {
                output.format("%s;%s;%s;%s;%s;%s;%s;%s\n", books[i][0], books[i][1], books[i][2], books[i][3], books[i][4], books[i][5], books[i][6], books[i][7]);
            }
            output.close();
        } catch(IOException ioe) {
            ioe.printStackTrace();
        }
    }
}