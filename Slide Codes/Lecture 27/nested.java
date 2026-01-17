import javax.swing.*;
import java.awt.event.*;
public class nested {
public static void main(String[] args) {
JFrame frame = new JFrame("Anonymous Class Example");
frame.setSize(300, 200);
frame.setLayout(null);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
JButton button = new JButton("Click Me!");
frame.add(button);
button.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
System.out.println("Button clicked");
System.out.println("actionPerformed method called");
System.out.println("Anonymous class implementing ActionListener");
}
});
frame.setVisible(true);
}
} 