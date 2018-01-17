

public class KennelTest
{
    public static void main(String args[])
    {
        Kennel kennelList = new Kennel[2];
        String msg = "";
        Kennel k1 = new Kennel("South Vet", 55.0);
        Kennel k2 = new Kennel("North Vet", 46.50);

        k1.addCustomer(new Customer("Jones", 1234, "cat", new Date(10,14,2017), new Date(10,18,2017)));
        k2.addCustomer(new Customer("Jims", 12343, "dog", new Date(11,1,2017), new Date(11,3,2017)));
        kennelList[0] = k1;
        kennelList[1] = k2;

        for(Kennel k:kennelList)
            msg += k.calculateCharges();

        System.out.println(msg);
    }
}