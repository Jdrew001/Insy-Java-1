/*
    Author: Drew Atkison
    File: BookTest
    Date: 11/06/17
 */

public class NonFiction extends Book 
{
    private String categoryCode;

    public NonFiction()
    {
        super();
        setCategoryCode("");
    }

    public NonFiction(String title, String author, String isbn, Publisher publisher, double price, String categoryCode)
    {
        super(title, author, isbn, publisher, price);
        setCategoryCode(categoryCode);
    }

    public void setCategoryCode(String categoryCode)
    {
        this.categoryCode = categoryCode;
    }

    public String getCategoryCode()
    {
        return this.categoryCode;
    }
    
    public double calculateCharge(int sold)
    {
        return (getPrice() * sold);
    }
}