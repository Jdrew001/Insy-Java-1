/*
    Author: Drew Atkison
    Date: September 13, 2017
    Problem 3
 */

import javax.swing.JOptionPane;

public class ApplianceTest {
    
    public static void main(String args[])
    {
        //create two appliance objects
        Appliance washer = new Appliance("washer", "Kenmore", 102956, 299.99);
        Appliance stove = new Appliance("stove", "GE", 8956, 575.75);

        String customerName;
        String message = "";
        String prompt = "Enter your name (or -1 to quit)";
        double total = 0.00;
        int numWashers = 0;
        int numStoves = 0;

        customerName = JOptionPane.showInputDialog(prompt);
        while(!customerName.toLowerCase().contains("-1"))
        {
            numWashers = Integer.parseInt(JOptionPane.showInputDialog("How many Kenmore washers "));
            numStoves = Integer.parseInt(JOptionPane.showInputDialog("How many GE stoves"));

            message += "Customer: " + customerName;
            message += String.format("\n %d %s washers were purchased for a total of $%.2f", numWashers, washer.getBrand(), (numWashers * washer.getPrice()));
            message += String.format("\n %d %s stoves were purchased for a total of $%.2f\n\n", numStoves, stove.getBrand(), (numStoves * stove.getPrice()));

            total += ((numWashers * washer.getPrice()) + (numStoves * stove.getPrice()));

            customerName = JOptionPane.showInputDialog(prompt); 
        }

        JOptionPane.showMessageDialog(null, message + String.format("The grand total is: $%.2f", total));
    }
}