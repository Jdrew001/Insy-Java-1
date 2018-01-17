public class Employee
{
    //key word private means not accesible outside this class
    private String firstName;
    private String lastName;
    private double monthlySalary;

    public Employee()
    {
        setFirstName("");
        setLastName("");
        setMonthlySalary(0.0);
    }

    public Employee(String firstName, String lastName, double monthlySalary)
    {
        setFirstName(firstName);
        setLastName(lastName);
        setMonthlySalary(monthlySalary);
    }

    //getters and setters

    //firstName
    public void setFirstName(String fName)
    {
        this.firstName = fName;
    }

    public String getFirstName()
    {
        return this.firstName;
    }

    //lastName
    public void setLastName(String lName)
    {
        this.lastName = lName;
    }

    public String getLastName()
    {
        return this.lastName;
    }

    //monthlySalary
    public void setMonthlySalary(double salary)
    {
        if(salary > 0)
            this.monthlySalary = salary;
    }

    public double getMonthlySalary()
    {
        return this.monthlySalary;
    }

    //requirement in class!! always use it
    public String toString()
    {
        return("First Name: " + firstName +
                " Last Name: " + lastName +
                " Monthly Salary: " + monthlySalary);
    }
}