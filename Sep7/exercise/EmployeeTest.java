public class EmployeeTest
{
    public static void main(String args[])
    {
        Employee e1 = new Employee("Laura", "Smith", 1000.00);
        Employee e2 = new Employee("john", "Doe", 2000.00);

        System.out.printf("Yearly Salary is $%.2f\n", (e1.getMonthlySalary() * 12));
        System.out.printf("Yearly Salary is $%.2f\n", (e2.getMonthlySalary() * 12));

        System.out.println(e1.toString());
        System.out.println(e2.toString());

        e1.setMonthlySalary(e1.getMonthlySalary() * 1.1);
        e2.setMonthlySalary(e2.getMonthlySalary() * 1.1);

        System.out.println(e1.toString());
        System.out.println(e2.toString());

        System.out.printf("Yearly Salary is $%.2f\n", (e1.getMonthlySalary() * 12));
        System.out.printf("Yearly Salary is $%.2f\n", (e2.getMonthlySalary() * 12));

    }
}