import javax.swing.JOptionPane;

public class PrinterTest
{
    public static void main(String args[])
    {
        Printer printer = new Printer(399.00, new Brand("Apple", "X"));
        ColorPrinter colorPrinter = new ColorPrinter(10, 299.00, new Brand("Apple", "X Color"));

        double colorTotal = 0.0;
        double printerTotal = 0.0;
        double grandTotal = 0.0;
        String msg = "";

        for(int i = 0; i < 10; i++)
        {
            printerTotal += printer.getPrice();
            colorTotal += colorPrinter.getPrice();
        }

        grandTotal = colorTotal + printerTotal;

        System.out.println("Printer : " + printerTotal);
        System.out.println("Color Printer: " + colorTotal);
        System.out.println("Grand Total: " + grandTotal);

        msg = "Printer: " + printer.getBrand().getName() + " " + printer.getBrand().getModel() + " " + printerTotal + " \n" +
            " Color Printer: " + colorPrinter.getBrand().getName() + " " + colorPrinter.getBrand().getModel() + " " + colorTotal;

        JOptionPane.showMessageDialog(null, msg);
    }
}