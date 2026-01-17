import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonPopupDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Button Popup Example");
        JButton button = new JButton("Show Popup");

        button.addActionListener(e -> {
            // Show input dialog
            String input = JOptionPane.showInputDialog(
                frame,
                "Enter something:",
                "Input",
                JOptionPane.QUESTION_MESSAGE
            );

            // Show result in a message dialog
            if (input != null) {
                JOptionPane.showMessageDialog(
                    frame,
                    "You entered: " + input,
                    "Result",
                    JOptionPane.INFORMATION_MESSAGE
                );
            }
        });

        frame.add(button);
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}