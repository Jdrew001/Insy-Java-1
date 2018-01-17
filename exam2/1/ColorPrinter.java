public class ColorPrinter extends Printer
{
    private int numberOfCartRidges;

    public ColorPrinter()
    {
        super();
        setNumOfCartRidges(0);
    }

    public ColorPrinter(int number, double price, Brand brand)
    {
        super(price, brand);
        setNumOfCartRidges(number);
    }

    public void setNumOfCartRidges(int number)
    {
        this.numberOfCartRidges = number;
    }

    public int getNumOfCartRidges()
    {
        return this.numberOfCartRidges;
    }

    public double calculateCharge(int number)
    {
        double total = super.calculateCharge(number);
        if(getNumOfCartRidges() > 5)
            total += 25;

        return total;
    }
}