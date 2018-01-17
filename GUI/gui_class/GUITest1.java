import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUITest1 extends JFrame {

    private JLabel ageLabel;
    private JLabel nameLabel;
    private JTextField nameField;
    private JTextField ageField;

    private JCheckBox maleBox;
    private JCheckBox femaleBox;

    private JButton button;
    private JButton finishButton;
    private ButtonGroup bgGroup;

    public GUITest1()
    {
        super("My Test GUI");
        //setLayout(new FlowLayout());
        setLayout(new GridLayout(4,2));
        nameLabel = new JLabel(" Enter name");
        ageLabel = new JLabel(" Enter age");

        nameField = new JTextField(20);
        ageField = new JTextField(20);
        ageField.setToolTipText("enter an integer");

        
        bgGroup = new ButtonGroup();
        maleBox = new JCheckBox("MALE");
        femaleBox = new JCheckBox("FEMALE");
        bgGroup.add(maleBox);
        bgGroup.add(femaleBox);
        
        button = new JButton(" Click here");
        finishButton = new JButton(" Finish");

        Handler myHandler = new Handler();
        button.addActionListener(myHandler);
        finishButton.addActionListener(myHandler);




        add(nameLabel);
        add(nameField);
        add(ageLabel);
        add(ageField);
        add(maleBox);
        add(femaleBox);
        add(button);
        add(finishButton);
    }
        
        
    
class Handler implements ActionListener{
    public void actionPerformed(ActionEvent ae){
        String name;
        int age;
        
        if(ae.getSource() == button)
        {
            name = nameField.getText();
            try{
                age = Integer.parseInt(ageField.getText());
            } catch()
            
        
            if(maleBox.isSelected())
                System.out.println("male");
            else
                System.out.println("female");
        
            System.out.println(name + " " + age);
            nameField.setText("");
            ageField.setText("");
            bgGroup.clearSelection();
            nameField.requestFocus();
        }
        else if (ae.getSource() == finishButton)
            System.exit(0);
    }
}
} 
