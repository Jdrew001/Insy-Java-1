public class Printer 
{
    private double price;
    private Brand brand;

    public Printer()
    {
        setPrice(0.0);
        setBrand(new Brand());
    }

    public Printer(double price, Brand brand)
    {
        setPrice(price);
        setBrand(brand);
    }

    public void setPrice(double price)
    {
        this.price = price;
    }
    public double getPrice()
    {
        return this.price;
    }

    public void setBrand(Brand brand)
    {
        this.brand = brand;
    }

    public Brand getBrand()
    {
        return this.brand;
    }

    public double calculateCharge(int number)
    {
        return (number * getPrice());
    }

    //tostring
}