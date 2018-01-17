public class Commercial extends Property
{
    private double cityTaxRate;

    public Commercial()
    {
        super();
        setCityTaxRate(0.0);
    }

    public Commercial(String pn, Address a, Owner o, double p, double rate)
    {
        super(pn, a, o, p);
        setCityTaxRate(rate);
    }

    public void setCityTaxRate(double r)
    {
        cityTaxRate = r;
    }

    public double getCityTaxRate()
    {
        return this.cityTaxRate;
    }

    public String toString()
    {
        return (" Tax Rate " + cityTaxRate + super.toString());
    }

    public double calculateCharge()
    {
        return getPrice() * cityTaxRate;
    }
}