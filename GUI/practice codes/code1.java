import javax.swing.*;
public class code1{
    public static void main(String args[]){
	JavaSwing obj = new JavaSwing();
	obj.setTitle("My Frame ");

	// adding button
	JButton button1=new JButton("Click Here");
	button1.setBounds(40,40,120,40);
	
	obj.add(button1);
	JLabel label = new JLabel("java swing label");
	label.setBounds(80,180,120,40);

	obj.add(label);
	
	obj.setLayout(null);
	obj.setSize(300,300);
	obj.setVisible(true);

	}//end main method
  }// end main class

class JavaSwing extends JFrame{

	
  }// end class