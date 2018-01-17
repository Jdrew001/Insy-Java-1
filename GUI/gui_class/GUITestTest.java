import javax.swing.*;

public class GUITestTest
{
	public static void main(String args[])
	{
		GUITest1 gt1 = new GUITest1 ();
		gt1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gt1.setSize(250,200);
		gt1.setLocationRelativeTo(null);
		gt1.setVisible(true);
	}
}