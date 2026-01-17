import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class JfAndJTextField{
public static void main(String args[]){
JFrame jfrm = new JFrame("JTextField");
jfrm.setLayout(null);
jfrm.setSize(220, 200);
jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
JTextField jtxt = new JTextField("Test!");
jtxt.setBounds (50,50,100,50);
jtxt.addActionListener(new eventHandler());
jfrm.add(jtxt);
jfrm.setVisible(true);
}
}
class eventHandler implements ActionListener{
public void actionPerformed(ActionEvent ae){
JTextField jtxt = (JTextField)ae.getSource();
System.out.println(jtxt.getText());
}
} 