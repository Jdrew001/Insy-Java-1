import javax.swingg.JOptionPane;
import java.util.Scanner;

public class CircleData
{
    public static void main(String args[])
    {
        String radiusString;
        int radius;
        double diameter;
        double circumference;
        double area;

        radiusString = JOptionPane.showInputDialog("Enter radius");
        radius = Integer.parseInt(radiusString);

        diameter = 2 * radius;
        circumference = 2 * Math.PI * radius;

        area = Math.PI*radius*radius;
        //area = Math.PI*Math.pow(radius, 2);

        System.out.printf("Diameter:%.2f\nCircumference:%.2f\nArea:%.2f", diameter, circumference, area);


    }
}