import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class textArea {
    public static void main(String args[]){
	JavaSwing frame = new JavaSwing();
	
		
	JLabel label1=new JLabel("ENTER YOUR DETAILS");
	label1.setBounds(80,0,150,50);
	frame.add(label1);
	
	
	JLabel label2=new JLabel("Name");
	label2.setBounds(20,25,50,40);
	frame.add(label2);
	
	JTextField field1=new JTextField("Enter your name");
	field1.setBounds(20,55,100,30);
	frame.add(field1);


	JLabel label3=new JLabel("Father Name");
	label3.setBounds(20,80,100,30);
	frame.add(label3);
	
	JTextField field2=new JTextField("Enter your father name");
	field2.setBounds(20,110,130,30);
	frame.add(field2);
	
	JLabel label4=new JLabel("Email");
	label4.setBounds(20,135,100,30);
	frame.add(label4);
	
	JTextField field3=new JTextField("Enter email id");
	field3.setBounds(20,160,130,30);
	frame.add(field3);

	

	
	
	JButton button1 =new JButton("SUBMIT2");
	button1.setBounds(45,195,80,20);
	frame.add(button1);
	


	// text area 
	JTextArea area1 = new JTextArea();
	area1.setBounds(20,220,200,50);
	area1.setBackground(Color.CYAN);
	area1.setForeground(Color.RED);
	frame.add(area1);

JButton button2 =new JButton("SUBMIT2");
	button2.setBounds(45,280,80,20);
	frame.add(button2);
	
	
	
	button1.addActionListener(new ActionListener(){
	@Override
	public void actionPerformed(ActionEvent e){
	JOptionPane.showMessageDialog(frame,"You entered "+field1.getText());
	System.out.println("You enterd name "+field1.getText());
	  }
	});

	button2.addActionListener(e->{
	JOptionPane.showMessageDialog(frame,"You entered in text box : "+area1.getText());
		});
	

	frame.makeFrame();
   }// end main method 
}// end main class

class JavaSwing extends JFrame {
void makeFrame(){
	setTitle("Suneel");
	setLayout(null);
	setSize(400,500);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setVisible(true);
   }
}// end class