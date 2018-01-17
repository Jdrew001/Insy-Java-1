/*
    Author: Drew Atkison
    File: BookTest
    Date: 11/06/17
 */

public class Publisher
{
    private String name;
    private String state;

    public Publisher()
    {
        setName("");
        setState("");
    }

    public Publisher(String name, String state)
    {
        setName(name);
        setState(state);
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }

    public void setState(String state)
    {
        this.state = state;
    }

    public String getState()
    {
        return this.state;
    }

    public String toString()
    {
        return ("Name " + getName() + " State " + getState());
    }
}