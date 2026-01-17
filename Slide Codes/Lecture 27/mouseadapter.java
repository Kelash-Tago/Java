import javax.swing.*;
import java.awt.event.*;
public class mouseadapter {
public static void main(String[] args) {
JFrame frame = new JFrame("Mouse Adapter Example");
frame.setSize(300, 200);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
JPanel panel = new JPanel();
frame.add(panel);
panel.addMouseListener(new MouseAdapter() {
@Override
public void mouseClicked(MouseEvent e) {
System.out.println("Mouse clicked at: " + e.getPoint());
}
@Override
public void mouseEntered(MouseEvent e) {
System.out.println("Mouse entered the panel");
}
});
frame.setVisible(true);
}
} 