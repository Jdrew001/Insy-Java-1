public class Kennel
{
    private String name;
    private double ratePerDay;
    private Customer customerList[] = new Customer[100];
    private int count = 0;

    public Kennel()
    {
        setName("");
        setRatePerDay(0.0);
    }

    public Kennel(String name, double ratePerDay)
    {
        setName(name);
        setRatePerDay(ratePerDay);
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }

    public void setRatePerDay(double rate)
    {
        this.ratePerDay = rate;
    }

    public double getRatePerDay()
    {
        return this.ratePerDay;
    }

    public Customer[] getCustomerList()
    {
        return this.customerList;
    }

    public void addCustomer(Customer customer)
    {
        this.customerList[count] = customer;
        count++;
    }

    public String calculateCharges()
    {
        double charge;
        String msg = "";

        for(Customer c:customerList)
        {
            if(c != null)
            {
                charge = (c.getDateReleased().getDay() - c.getDateAdmitted().getDay()) * ratePerDay; 

                msg += String.format("%s $%.2f", c.getName(), charge);
            } 
        }

        return msg;
    }
}