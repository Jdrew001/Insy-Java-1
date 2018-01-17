public class Address
{

    private String street;
    private String city;
    private String state;
    private String zip;

    public Address()
    {
        setStreet("");
        setCity("");
        setState("");
        setZip("");
    }

    public Address(String s, String c, String state, String zip)
    {
        setStreet(s);
        setCity(c);
        setState(state);
        setZip(zip);
    }

    public void setStreet(String s)
    {
        this.street = s;
    }

    public String getStreet()
    {
        return this.street;
    }

    public void setCity(String c)
    {
        this.city = c;
    }

    public String getCity()
    {
        return this.city;
    }

    public void setState(String state)
    {
        this.state = state;
    }

    public String getState()
    {
        return this.state;
    }

    public void setZip(String zip)
    {
        this.zip = zip;
    }

    public String getZip()
    {
        return this.zip;
    }
}