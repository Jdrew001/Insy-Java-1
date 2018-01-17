/*
    Author: Drew Atkison
    File: BookTest
    Date: 11/06/17
 */

public class Fiction extends Book 
{
    private String fictionCode;

    public Fiction()
    {
        super();
        setFictionCode("");
    }

    public Fiction(String title, String author, String isbn, Publisher publisher, double price, String fictionCode)
    {
        super(title, author, isbn, publisher, price);
        setFictionCode(fictionCode);
    }

    public void setFictionCode(String fictionCode)
    {
        this.fictionCode = fictionCode;
    }

    public String getFictionCode()
    {
        return this.fictionCode;
    }

    public double calculateCharge(int sold)
    {
        return (getPrice() * sold);
    }
}