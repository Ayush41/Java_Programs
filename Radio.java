import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class Radio {

    public static void main(String[] args) {

        // Create a frame to hold the RadioButtons
        JFrame frame = new JFrame("RadioButton Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // Create a ButtonGroup to hold the RadioButtons
        ButtonGroup group = new ButtonGroup();

        // Create three RadioButtons and add them to the ButtonGroup and the frame
        JRadioButton option1 = new JRadioButton("Option 1");
        group.add(option1);
        frame.add(option1);

        JRadioButton option2 = new JRadioButton("Option 2");
        group.add(option2);
        frame.add(option2);

        JRadioButton option3 = new JRadioButton("Option 3");
        group.add(option3);
        frame.add(option3);

        // Set the frame to be visible
        frame.setVisible(true);
    }
}