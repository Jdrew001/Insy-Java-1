import javax.swing.JOptionsPane;

public class OddEvenDialog
{
    public static void main(String args[])
    {
        int number;
        String answer;

        number = Integer.parseInt(JOptionsPane.showInputDialog("Enter an integer"));

        if(number % 2 == 0)
            answer = "Even";
        else
           answer = "Odd"

        System.out.println("The answer is: " + answer);
        JOptionPane.showMessageDialog(null, answer);
    }
}