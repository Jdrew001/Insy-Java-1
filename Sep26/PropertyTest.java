public class PropertyTest
{
    public static void main(String args[])
    {
        Property pArray[] = new Property[2];
        String msg = "";
        pArray[0] = new Commercial("p-2345", new Address("Cooks lane", "Handly", "Texas", "75051"),
                        new Owner("Jones", new Address("Trail Rd", "Amarillo", "Texas", "75052")), 12500, .08);

        pArray[1] = new Residential("p-2376", new Address("Cook Rd", "Dallas", "Texas", "75051"),
                        new Owner("Jims", new Address("Hotline Lane", "Dalhart", "Texas", "75052")), 67000, .05);

        for(Property p:pArray)
            msg += String.format("%s %.2f\n", p.createInvoice(), p.calculateCharge());

        System.out.println(msg);
    }
}