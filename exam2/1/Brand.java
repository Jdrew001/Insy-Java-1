public class Brand 
{
    private String name;
    private String model;

    public Brand()
    {
        setName("");
        setModel("");
    }

    public Brand(String name, String model)
    {
        setName(name);
        setModel(model);
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    public String getModel()
    {
        return this.model;
    }
}