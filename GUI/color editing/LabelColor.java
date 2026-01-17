import javax.swing.*;
import java.awt.*;
public class LabelColor{
public static void main(String args[]){
	JavaSwing frame=new JavaSwing();
	
	// color
	//frame.getContentPane().setBackground(Color.LIGHT_GRAY);
	//or
	Color myColor = new Color(255, 200, 150); // Light orange
    frame.getContentPane().setBackground(myColor);
	
	//label color
	JLabel label1=new JLabel("Name");
	label1.setBounds(50,20,60,20);
	//label1.setForeground(Color.WHITE);
	label1.setOpaque(true);
	Color label1Color=new Color(102,178,255);
	label1.setBackground(label1Color);
	frame.add(label1);
	
	
	frame.setVisible(true);
   }// end main method
  }// end main class 

class JavaSwing extends JFrame{

  public JavaSwing(){
	setTitle("Kelash");
	setLayout(null);
	setSize(600,400);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }


}