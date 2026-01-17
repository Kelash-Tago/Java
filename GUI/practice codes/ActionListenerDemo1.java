import javax.swing.*;
//import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionListenerDemo1{
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


	// button
	JButton button1=new JButton("Submit");	button1.setBounds(50,80,200,30);
	frame.add(button1);

/*
	button1.addActionListener(new ActionListener(){
	@Override
	public void actionPerformed(ActionEvent e){
	System.out.println(field1.getText());
}
});
*/
	button1.addActionListener(e -> {
    JOptionPane.showMessageDialog(
        frame,
        "You entered: " + field1.getText(),
        "Input Result",
        JOptionPane.INFORMATION_MESSAGE
    );
});
	

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