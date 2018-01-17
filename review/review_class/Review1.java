/*
    Review for test 1
 */

 public class Review1 
 {
    public void main(String args[])
    {
         //1
         System.out.println("Drew");
         System.out.println(76019);


        System.out.println("Drew" + " \n" + 76059);

        System.out.println("%s\n%d", "Drew ", 75059); 
    }
 }


 public class Review2 
 {
     public void main(String args[])
     {
         Scanner input = new Scanner(System.in);
         int counter = 1;
         int total = 0;
         while(counter <= 5)
         {
             SYstem.out.println("Enter number");

             number = input.nextInt();
             total += number;
             counter++;
         }


         for(int i = 0; i <= 5; i++)
         {
             System.out.println("Enter number");
             number = input.nextInt();
             total += number;
         }
     }
 }

 public class Review3
 {
     public void main(String args[])
     {
         if(number == 5)
            number *= 2;
        if(number == 7)
            number /= 3;
        if((number == 2) || (number ==6))
            number++;
        if((number != 4) && (number > 10))
            number += 2;
     }
 }

 public class ReviewX
 {
     public void main(String args[])
     {
         System.out.println("Enter a number: ");
         number = input.nextInt();
         int count = 0;
         while (number != -999)
         {
             total += number;
             count++;

             System.out.println("Enter a number: ");
            number = input.nextInt();
         }
     }
 }

 /*4
    A) 12*2 = 8 + 24 - 4 = 28
    B) (4+7) = 11 ---- 11%2 - 1 --- 1-1 = 0

  */

  public class Review5 
  {
      public static void main(String args[])
      {
          if(number == 1)
            System.out.println("One");
        else if(number == 2)
            System.out.println("Two");
        else if(number == 3)
            System.out.println("Three");
        else if(number == 4)
            System.out.println("Four");
        else if(number == 5)
            System.out.println("Five");
      }
  }

  public class Review8
  {
      public static void main(String args[])
      {
          switch(number)
          {
              case 1: System.out.println("one");
              break;
              case 2: System.out.println("two");
              break;
              case 3: System.out.println("three");
              break;
              case 4: System.out.println("four");
              break;
              case 5: System.out.println("five");
              break;
              default: System.out.println("Default fired");

          }
      }
  }

  /*
    5

    A) int x;
    B) public static void main
    C) z + 17 = y;
   */

   import java.util.Scanner;
   public class Review10
   {
       public static void main(String args[])
       {
           Scanner input = new Scanner(System.in);
           int yards;
           System.out.println("Enter in number for yards: ");
           yards = input.nextInt();

           System.out.println(yards * 3);
       }
   }

    /* 11 8 primitive types for java -- apendix D or A in book
        double, float
        long, short, int, byte, char
        String
     */

     // 12 true and false

    //13
    import javax.swing.JOptionPane;
    public class Odd 
    {
        public static void main(String args[])
        {
            int number;
            int total = 0;
            number = Integer.parseInt(JOptionPane.showInputDialog("Enter number: "));

            for(int i = 1; i < number; i++)
            {
                if(i % 2 == 1)
                    total += i;
            }
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
            this.title = "";
            this.publisher = "";
            this.edition = 0;
        }
        public Magazine(String title, String publisher, int edition)
        {
            this.title = title;
            this.publisher = publisher;
            this.edition = edition;
        }
        
        public void setTitle(String t)
        {
            this.title = t;
        }
        public void setPublisher(String p)
        {
            this.publisher = p;
        }
        public void setEdition(int e)
        {
            this.edition = e;
        }
        public String getTitle()
        {
            return this.title;
        }
        public String getPublisher()
        {
            return this.publisher;
        }
        public int getEdition()
        {
            return this.edition;
        }

        public String toString()
        {
            return (" Title " + title + " Publisher " publisher + " Edition " + edition);
        }

    }

    import java.util.Scanner;
    //test case for 14
    public class PublisherTest
    {
        public static void main(String args[])
        {
            String title;
            String publisher;
            int edition;
            Scanner input = new Scanner(System.in);
            System.out.println("Enter title");
            title = input.nextLine();

            System.out.println("Enter publisher");
            publisher = input.nextLine();

            System.out.println("Enter Edition");
            edition = input.nextInt();

            Magazine m1 = new Magazine(title, publisher, edition);

            System.out.println(m1.getTitle() + " " + m1.getPublisher() + " " + m1.getEdition())
        }
    }

    //15
    public class Automobile
    {
        private String brand;
        private String type;
        private double price;

        public Automobile()
        {
            this.brand = "";
            this.type = "";
            this.price = 0.00;
        }
        public Automobile(String brand, String type, double price)
        {
            this.brand = brand;
            this.type = type;
            this.price = type;

            //she did this on the last problem -- do it like this one
            setBrand(brand);
            setType(type);
            setPrice(price);
        }

        //getters and setters
        public void setBrand(String brand)
        {
            this.brand = brand;
        }
        public String getBrand()
        {
            return this.brand;
        }

        public void setType(String type)
        {
            this.type = type;
        }
        public String getType()
        {
            return this.type;
        }

        public void setPrice(double price)
        {
            this.price = price;
        }
        public double getPrice()
        {
            return this.price;
        }

        public String toString()
        {
            return //usual
        }
    }

    //test program for 15
    import java.util.Scanner;
    public class AutomobileTest
    {
        public static void main(String args[])
        {
            String brand;
            String type;
            double price;
            int total;

            Scanner input = new Scanner(System.in);
            System.out.println("Enter Brand: ");
            brand = input.nextLine();

            System.out.println("Enter type");
            type = input.nextLine();

            Sytem.out.println("Enter price");
            price = input.nextDouble();

            Automobile a1 = new Automobile(brand, type, price);
            System.out.println("How many automobiles?");
            total = input.nextInt();

            System.out.println("$%.2f", number * a1.getPrice());
        }
    }

    //16
    public void calculatePay(double hours, double payRate)
    {
        double grossPay;

        //calculate overtime
        if(hours >= 40)
            grossPay = (40 * payRate) + ((hours - 40)*payRate*1.5);
        else
            grossPay = hours * payRate;


        System.out.printf("$%.2f", grossPay);
    }

    //17
    public int average()
    {
        Scanner input = new Scanner(System.in);
        int number1;
        int number2;
        int number3;

        System.out.println("Enter first name");
        number1 = input.nextInt();
        number2 = input.nextInt();
        number3 = input.nextInt();

        return ((number1 + number2 + number3) / 3);
    }

    //18
    public class Test
    {
        public static void main(String args[])
        {
            double avg;
            calculatePay(45, 25.50);

            avg = average();
        }
    }

    *************
    if you want to compare Strings, then you have to use .equals()
    if("yes".equals(var))