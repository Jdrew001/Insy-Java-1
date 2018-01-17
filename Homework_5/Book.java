/*
    Author: Drew Atkison
    File: BookTest
    Date: 11/06/17
 */

public abstract class Book implements Invoice
{
    private String title;
    private String author;
    private String isbn;
    private Publisher publisher;
    private double price;
    
    public Book()
    {
        setTitle("");
        setAuthor("");
        setIsbn("");
        setPublisher(new Publisher());
        setPrice(0.0);
    }

    public Book(String title, String author, String isbn, Publisher publisher, double price)
    {
        setTitle(title);
        setAuthor(author);
        setIsbn(isbn);
        setPublisher(publisher);
        setPrice(price);
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getTitle()
    {
        return this.title;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

    public String getAuthor()
    {
        return this.author;
    }

    public void setIsbn(String isbn)
    {
        this.isbn = isbn;
    }

    public String getIsbn()
    {
        return this.isbn;
    }

    public void setPublisher(Publisher publisher)
    {
        this.publisher = publisher;
    }

    public Publisher getPublisher()
    {
        return this.publisher;
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
        return ("Title " + getTitle() + " Author " + getAuthor() + " Isbn " 
                + getIsbn() + " publisher " + getPublisher().toString() + " price " + getPrice());
    }

    public String createInvoice(int purchased)
    {
        double total = calculateCharge(purchased);
        String msg = "Title: " + getTitle() + " " 
                + "ISBN: " + getIsbn() + " Total Charge: " + String.format("$%.2f", total) + "\n";

        return msg;
    }

    public abstract double calculateCharge(int sold);
}