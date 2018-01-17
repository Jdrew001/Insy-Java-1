public abstract class Property implements Invoice
{
    private String platNumber;
    private Address address;
    private Owner owner;
    private double price;

    public Property()
    {
        setPlateNumber("");
        setAddress(new Address());
        setOwner(new Owner());
        setPrice(0.0);
    }

    public Property(String pn, Address a, Owner o, double p)
    {
        setPlateNumber(pn);
        setAddress(a);
        setOwner(o);
        setPrice(p);
    }

    public void setPlateNumber(String pn)
    {
        this.platNumber = pn;
    }

    public String getPlateNumber()
    {
        return this.platNumber;
    }

    public void setAddress(Address a)
    {
        this.address = a;
    }

    public Address getAddress()
    {
        return this.address;
    }

    public void setOwner(Owner o)
    {
        this.owner = o;
    }

    public Owner getOwner()
    {
        return this.owner;
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
        return "Plate Number " + getPlateNumber() + " Address " + getAddress() + " Owner " + getOwner() + " Price " + getPrice();
    }

    public String createInvoice()
    {
        String msg = "";
        msg = String.format("%s %s", getOwner().getName(), platNumber);
        return msg;
    }

    public abstract double calculateCharge();
    
}