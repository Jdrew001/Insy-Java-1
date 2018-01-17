import javax.swing.JOptionPane;

public class Main
{
    public static void main(String args[])
    {
        String firstNumber = JOptionPane.showInputDialog("Enter the first number");
        String secondNumber = JOptionPane.showInputDialog("Enter the second number");

        int numberOne = Integer.parseInt(firstNumber);
        int numberTwo = Integer.parseInt(secondNumber);

        int sum = numberOne + numberTwo;

        JOptionPane.showMessageDialog(null, "The answer: " + sum);

    }
}