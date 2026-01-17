import javax.swing.*;
import java.awt.*;
import javax.swing.border.LineBorder;
import java.awt.event.*;

public class MouseListenerDemo extends JFrame implements MouseListener {
    JLabel label;

    public MouseListenerDemo() {
        // Create a JFrame window
        setTitle("MouseListener Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Create and configure a label
        label = new JLabel("Click or Hover the Mouse Here");
        label.setBounds(100, 100, 200, 30);
        label.setBorder(new LineBorder(Color.BLACK));

        add(label);

        // Add MouseListener to the label
        label.addMouseListener(this);

        setVisible(true);
    }

    // MouseListener methods
    @Override
    public void mouseClicked(MouseEvent e) {
        label.setText("Mouse Clicked");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        label.setText("Mouse Pressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        label.setText("Mouse Released");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        label.setText("Mouse Entered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        label.setText("Mouse Exited");
    }

    // Main method to run the application
    public static void main(String[] args) {
        new MouseListenerDemo();
    }
}
