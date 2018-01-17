//1
public static void main(String args[])
{
    //method 1
    System.out.println("Drew Atkison");
    System.out.println("75052");

    //method 2
    System.out.println("Drew Atkison\n75052");

    //method 3
    System.out.printf("%s\n%s", "Drew Atkison", "75052");
}

import java.util.Scanner;
public class Test 
{
    public static void main(String main[])
    {
        Scanner input = new Scanner(System.in);
        int total = 0;
        int number;


        System.out.println("Enter a number: (-999 to quit)");
        number = input.nextInt();

        while(number !== -999)
        {
            total += number;
            System.out.println("Enter a number: (-999 to quit)");
            number = input.nextInt();
        }

        System.out.println("Your total is: %d", total);
    }
}

public class Test
{
    
}

//2
import java.util.Scanner;
int count = 1;
double number;
double final = 0.0;
Scanner input = new Scanner(System.in);
while(count <= 5)
{
    System.out.println("Enter a number: ");
    number = input.nextDouble();

    final += number;
    count++;
}

for(int i = 0; i < 5; i++)
{
    System.out.println("Enter a number: ");
    number = input.nextDouble();
    final += number;
}

//3
if(number == 5)
    number *= 2;
if(number == 7)
    number \= 3;
if(number == 2 || number == 6)
    number += 1;
if(number != 4 && number < 10)
    number += 2;

//4
//a 8 + (12 * 2) - 4 --> 8 + 24 - 4 --> 32 - 4 = 28

//b (4 + 7) % 2 - 1 --> 11 % 2 - 1 --> 1 - 1 --> 0

//c (6 - 3) * 2 + 7 - 1 --> 3 * 2 + 7 - 1 --> 6 + 7 - 1 --> 13 - 1 --> 12

//5
//The difference is the floating point number has a decimal and the int does not

//6
import java.util.Scanner;
Scanner input = new Scanner(System.in);
int count = 0;
int number;
int final = 0;

System.out.println("Enter a number");
number = input.nextInt();

while(number !== -999) {
    System.out.println("Enter a number");
    number = input.nextInt();

    final += number;
    count++;
}

//7
if(number == 1)
    System.out.println("One");
else if (number == 2)
    System.out.println("Two");
else if (number == 3)
    System.out.println("Three");
else if (number == 4)
    System.out.println("Four");
else if (number == 5)
    System.out.println("Five");
//8
switch(number)
{
    case 1: System.out.println("One");
    break;
    case 2: System.out.println("Two");
    break;
    case 3: System.out.println("Three");
    break;
    case 4: System.out.println("Four");
    break;
    case 5: System.out.println("Five");
    break;
}

//9
//a mistake is integer is actually int x;
//b static is missing from the method definition
//c y + 7 = z is actually how you write it.

//10
import java.util.Scanner;

public class Conversion
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int yards;
        int feet;

        System.out.println("Please enter a number in yards: ");
        yards = input.nextInt();

        feet = yards * 3;
        System.out.println("%d feet in %d yards", feet, yards);
    }
}

//11 int and float
// Java has eight primitive types: byte , short , int , long , char , boolean , float and double 

//12 true or false

//13
import javax.swing.JOptionPane;

public class program
{
    public static void main(String args[])
    {
        int number;
        int total = 0;
        number = Integer.parseInt(JOptionPane.showInputDialog("Enter a number: "));
        
        for(int i = 1; i < number; i++)
        {
            if(i % 2 == 1)
                total += i;
        }

        System.out.println(total);
    }
}

//14
public class Magazine
{
    private String title;
    private String publisher;
    private int edition;

    public Magazine()
    {
        setTitle("");
        setPublisher("");
        setEdition(0);
    }

    public Magazine(String title, String publisher, int edition)
    {
        setTitle(title);
        setPublisher(publisher);
        setEdition(edition);
    }

    //getters and setters
    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getTitle()
    {
        return this.title;
    }

    public void setPublisher(String publisher)
    {
        this.publisher = publisher;
    }

    public String getPublisher()
    {
        return this.publisher;
    }

    public void setEdition(int edition)
    {
        this.edition = edition;
    }

    public int getEdition()
    {
        return this.edition;
    }

    public String toString()
    {
        return (" Title " + this.title + " Publisher " + this.publisher + " Edition " + edition);
    }
}

import java.util.Scanner;

public class MagazineTest 
{
    public static void main(String args[])
    {
        Magazine m1 = new Magazine();
        Scanner input = new Scanner(System.in);
        String title;
        String publisher;
        int edition;

        System.out.println("Enter a magazine title");
        title = input.nextLine();

        System.out.println("Enter a publisher");
        publisher = input.nextLine();

        System.out.println("Enter an edition");
        edition = input.nextInt();

        m1.setTitle(title);
        m1.setPublisher(publisher);
        m1.setEdition(edition);

    }
}
