public class Employee
{
    private String name;
    private int i;
    private double monthlySalary;
    private static int employeeCount;

    public Employee()
    {
        setName("");
        setId(0);
        setMonthlySalary(0.0);
        employeeCount++;
    }

    public Employee(String n, int i, double s)
    {
        setName(n);
        setId(i);
        setMonthlySalary(s);
        employeeCount++;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setId(int id)
    {
        this.i = id;
    }

    public void setMonthlySalary(double s)
    {
        this.monthlySalary = s;
    }

    public String getName()
    {
        return this.name;
    }

    public int getIncome()
    {
        return this.i;
    }

    public double getMonthlySalary()
    {
        return this.monthlySalary;
    }

    public String toString()
    {
        return ("Name " + this.name + " ID " + this.i + " Monthly Salary " + this.monthlySalary);
    }

    public double calculateSalary()
    {
        return this.monthlySalary * 12;
    }

    public double calculateTaxes(double rate)
    {
        return this.monthlySalary * rate;
    }

    public void calculateRaise(double percent)
    {
        monthlySalary *= percent + 1.0;
    }

    public static int getEmployeeCount()
    {
        
    }
}