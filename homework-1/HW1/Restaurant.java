/*
    Author: Drew Atkison
    Date: September 13, 2017
    Problem 3
 */

import javax.swing.JOptionPane;

public class Restaurant 
{
    public static void main(String args[])
    {
        String name;
        double mealCharge;
        double taxRate = .0675;
        double totalTax;
        double tipRate = .15;
        double totalTip;
        double totalBill;

        name = JOptionPane.showInputDialog("Enter the waiter name.");
        mealCharge = Integer.parseInt(JOptionPane.showInputDialog("Enter the meal charge."));

        totalTax = taxRate * mealCharge;
        totalTip = tipRate * (mealCharge + totalTax);
        totalBill = mealCharge + totalTax + totalTip;


        JOptionPane.showMessageDialog(null, name 
            + String.format("\nMeal Charge $%.2f", mealCharge) 
            + String.format("\nTax $%.2f", totalTax)
            + String.format("\nTip $%.2f", totalTip)
            + String.format("\nTotal Bill $%.2f", totalBill));
    }
}