public class Customer
{
    private String name;
    private int accountNumber;
    private String petName;
    private Date dateAdmitted;
    private Date dateReleased;
    
    public Customer()
    {
        setName("");
        setAccountNumber(0);
        setPetName("");
        setDateAdmitted(new Date());
        setDateReleased(new Date());
    }

    public Customer(String name, int accountNumber, String petName, Date dateAdmitted, Date dateReleased)
    {
        setName(name);
        setAccountNumber(accountNumber);
        setPetName(petName);
        setDateAdmitted(dateAdmitted);
        setDateReleased(dateReleased);
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }

    public void setAccountNumber(int number)
    {
        this.accountNumber = number;
    }

    public int getAccountNumber()
    {
        return this.accountNumber;
    }

    public void setPetName(String name)
    {
        this.petName = name;
    }

    public String getPetName()
    {
        return this.petName;
    }

    public void setDateAdmitted(Date date)
    {
        this.dateAdmitted = date;
    }

    public Date getDateAdmitted()
    {
        return this.dateAdmitted;
    }

    public void setDateReleased(Date date)
    {
        this.dateReleased = date;
    }

    public Date getDateReleased()
    {
        return this.dateReleased;
    }

    //tostring method

    public abstract double calculateCharges();
}