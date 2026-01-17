import javax.swing.*;
import java.awt.Image;
//import java.net.URL;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class GraphicTest {
    public static void main(String args[]){
	JavaSwing frame = new JavaSwing();
	
	ImageIcon icon =new ImageIcon("F:\\GUI\\practice codes\\IBAlogo.jpeg");
	Image image=icon.getImage().getScaledInstance(50,50,Image.SCALE_SMOOTH);
	
	ImageIcon scaledIcon =new ImageIcon(image);



	JLabel logoLabel=new JLabel(scaledIcon);
	logoLabel.setBounds(200,0,120,120);
	frame.add(logoLabel);


		
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
	
JButton button2 =new JButton("SUBMIT2");
	button2.setBounds(45,220,80,20);
	frame.add(button2);
	
	
	button1.addActionListener(new ActionListener(){
	@Override
	public void actionPerformed(ActionEvent e){
	JOptionPane.showMessageDialog(frame,"You entered "+field1.getText());
	//System.out.println("You enterd name "+field1.getText());
	  }
	});

	button2.addActionListener(e->{
	JOptionPane.showMessageDialog(frame,"You have clicked submit 2");
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