import javax.swing.*;
import java.awt.*;
import javax.swing.border.LineBorder;
import java.awt.event.*;

public class mouseListener extends JFrame implements MouseListener {
    JLabel label;

    public mouseListener() {
        // Create a JFrame window
        setTitle("MouseListener Example");
        setSize(300, 300);
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
        new mouseListener();
    }
}


public interface MouseListener extends EventListener {

    // Invoked when a mouse button has been pressed on a component
    void mousePressed(MouseEvent e);

    // Invoked when a mouse button has been released on a component
    void mouseReleased(MouseEvent e);

    // Invoked when the mouse enters a component
    void mouseEntered(MouseEvent e);

    // Invoked when the mouse exits a component
    void mouseExited(MouseEvent e);

    // Invoked when a mouse button has been clicked (pressed and released) on a component
    void mouseClicked(MouseEvent e);
}
