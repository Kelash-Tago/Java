import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionListenerDemo {  // Renamed to avoid conflict
    public static void main(String args[]) {
        JavaSwing frame = new JavaSwing();

        // Label for name textfield
        JLabel label1 = new JLabel("Name");
        label1.setBounds(50, 10, 80, 20);
        frame.add(label1);

        // Textfield
        JTextField field1 = new JTextField("Write your name here ");
        field1.setBounds(50, 40, 400, 30);
        frame.add(field1);

        // Button
        JButton button1 = new JButton("Submit");
        button1.setBounds(50, 80, 200, 30);
        frame.add(button1);

        // ActionListener implementation
        button1.addActionListener(new ActionListener() {
            @Override  // Corrected annotation
            public void actionPerformed(ActionEvent e) {
                label1.setText("Submitted successfully...");
                            }
        });

        // Making frame visible last
        frame.makeFrame();
    }
}

class JavaSwing extends JFrame {
    void makeFrame() {
        setTitle("My Frame");
        setLayout(null);
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Added JFrame. for clarity
        setVisible(true);
    }
}