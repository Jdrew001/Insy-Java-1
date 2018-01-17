/*
    Author: Drew Atkison
    Date: September 13, 2017
    Problem 3
 */

public class Appliance {

    private String type;
    private String brand;
    private int modelNum;
    private double price;

    public Appliance()
    {
        setType("");
        setBrand("");
        setModelNum(0);
        setPrice(0.0);
    }

    public Appliance(String type, String brand, int modelNum, double price)
    {
        //setters here
        setType(type);
        setBrand(brand);
        setModelNum(modelNum);
        setPrice(price);
    }

    //getters and setters
    public void setType(String type)
    {
        this.type = type;
    }
    public String getType()
    {
        return this.type;
    }

    public void setBrand(String brand)
    {
        this.brand = brand;
    }

    public String getBrand()
    {
        return this.brand;
    }

    public void setModelNum(int modelNum)
    {
        this.modelNum = modelNum;
    }

    public int getModelNum()
    {
        return this.modelNum;
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
        return(String.format("Type: %s\nBrand: %s\nModel Number: %d\nPrice: %.2f"));
    }

}