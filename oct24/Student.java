import java.io.*;
import java.util.*;

public class Student
{
    public static void main(String args[])
    {
        try {
            Formatter output = new Formatter(new File("students.txt"));

            output.format("%s %d%n", "Jones", 25);
            output.format("%s %d%n", "Smith", 36);

            output.close();
        }
        catch(IOException error)
        {
            error.printStackTrace();
        }
        
    }
}