import java.util.Scanner;
import javax.swing.JOptionPane;

public class EmployeeTest
{
    private static Employee employee;
    private static String name;
    private static int id;
    private static double salary;
    private static String msg = "";

    public static void main(String args[])
    {
        ReadData();

        JOptionPane.showMessageDialog(null, msg);
    }

    public static void ReadData()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name: ");
        name = input.nextLine();

        while(!name.equals("quit"))
        {
            System.out.println("Enter Id: ");
            id = input.nextInt();

            System.out.println("Enter Salary: ");
            salary = input.nextDouble();

            employee = new Employee(name, id, salary);
        
            employee.calculateRaise(0.1);
        
            msg += String.format("%s $%.2f, Monthly Taxes: $%.2f\n", employee.getName(), employee.getMonthlySalary(), employee.calculateTaxes(0.05));

            msg += String.format("%s $%.2f, Yearly Taxes: $%.2f\n", employee.getName(), employee.getMonthlySalary(), employee.calculateTaxes(0.05) * 12);

            input.nextLine();
            System.out.println("Enter name: ");
            name = input.nextLine();
        }
    }
}