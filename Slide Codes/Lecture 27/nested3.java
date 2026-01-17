import javax.swing.*;
import java.awt.event.*;
public class nested3 {
public static void main(String[] args) {
JFrame frame = new JFrame("Local Class Example");
frame.setSize(300, 200);
frame.setLayout(null);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
JButton button = new JButton("Click Me!");
button.setBounds(20,30,100,50);
frame.add(button);
addClickListener(button);
frame.setVisible(true);
}
public static void addClickListener(JButton button) {
class ButtonClickListener implements ActionListener {
public void actionPerformed(ActionEvent e) {
System.out.println("Button was clicked!");
}
}
button.addActionListener(new ButtonClickListener());
}
} 