public class Residential extends Property
{
    private double exemptionRate;

    public Residential()
    {
        super();
        setExemptionRate(0.0);
    }

    public Residential(String pn, Address a, Owner o, double price, double rate)
    {
        super(pn, a, o, price);
        setExemptionRate(rate);
    }

    public void setExemptionRate(double rate)
    {
        this.exemptionRate = rate;
    }

    public double getExemptionRate()
    {
        return this.exemptionRate;
    }

    public String toString()
    {
        return "";
    }

    public double calculateCharge()
    {
        if(getAddress().getState().equals("Texas"))
            return 0;
        else  
            return getPrice() * exemptionRate;
    }
}