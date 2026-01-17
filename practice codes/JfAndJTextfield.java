import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JfAndJTextfield {

    public static void main(String args[]) {
        // Create a new JFrame container.
        JFrame jfrm = new JFrame("JTextField");

        // Specify layout for frame.
        jfrm.setLayout(null);

        // Give the frame an initial size.
        jfrm.setSize(220, 200);

        // Terminate the program when the user closes the application.
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make a text field
        JTextField jtxt = new JTextField("Test!");

        // Select location of text field on frame
        jtxt.setBounds(50, 50, 100, 50);

        // Register action listener with event source that is text field
        // You will see value in command prompt after pressing enter key
        jtxt.addActionListener(new eventHandler());

        // Add the text field to the content pane.
        jfrm.add(jtxt);

        // Display the frame
        jfrm.setVisible(true);
    }
}

class eventHandler implements ActionListener {
    public void actionPerformed(ActionEvent ae) {
        Object jtxt =  ae.getSource();
        System.out.println(jtxt.getText());
    }
} 