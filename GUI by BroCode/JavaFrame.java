import javax.swing.*;
import java.awt.*;
public class JavaFrame {

    public static void main(String[] args) {
        JFrame frame =new JFrame("My frame");
        frame.setLayout(null);
        frame.setSize(500,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon image =new ImageIcon("logo.png");
        frame.setIconImage(image.getImage());
        //frame.getContentPane().setBackground(new Color(122,155,44));
       // frame.getContentPane().setBackground(new Color(0xf74569));
       ImageIcon image2 =new ImageIcon("logo.png");

        JLabel label1 =new JLabel();
        label1.setIcon(image2);
        //label1.setBounds(30,20,100,40);
        frame.add(label1);

        JLabel label2 =new JLabel("MDCAT DATA");
        label2.setBounds(20,30,100,30);
        frame.add(label2);



        frame.setVisible(true);

    }
}