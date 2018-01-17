public class Owner
{
    private String name;
    private Address address;

    public Owner()
    {
        setName("");
        setAddress(new Address());
    }

    public Owner(String name, Address a)
    {
        setName(name);
        setAddress(a);
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }

    public void setAddress(Address address)
    {
        this.address = address;
    }

    public Address getAddress()
    {
        return this.address;
    }
}