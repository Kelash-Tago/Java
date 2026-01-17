import javax.swing.*;
public class TextField{
    public static void main(String args []){
	JavaSwing frame=new JavaSwing();

	//label for name textfield
	JLabel label1=new JLabel("Name");
	label1.setBounds(50,10,80,20);
	frame.add(label1);


	// Textfield
	JTextField field1=new JTextField("Write your name here ");
	field1.setBounds(50,40,400,30);
	frame.add(field1);


	// buttom
	JButton button1=new JButton("Submit");	button1.setBounds(50,80,200,30);
	frame.add(button1);
	
	

	//making frame in last so that all components visible on frame
	frame.makeFrame();

     }//end main method

}// end main class 
class JavaSwing extends JFrame{
	
void makeFrame(){
	setTitle("My Frame");
	setLayout(null);
	setSize(600,600);
	setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	
  }// frame method

 }//end class