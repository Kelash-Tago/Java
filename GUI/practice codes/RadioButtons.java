import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class RadioButtons{
    public static void main(String args[]){
	JavaSwing frame = new JavaSwing();
	frame.makeFrame();
	frame.createRadioButtons();
	
	JButton button1 =new JButton("check");
	button1.setBounds(50,110,80,30);
	frame.add(button1);  
	

	button1.addActionListener(new ActionListener(){
	@Override
        public void actionPerformed(ActionEvent e){


	if(frame.button1.isSelected()){
	JOptionPane.showMessageDialog(frame,"You are "+frame.button1.getText());

	}
	else if(frame.button2.isSelected()){
	JOptionPane.showMessageDialog(frame,"You are "+frame.button2.getText());

	}


	else if(frame.button3.isSelected()){
	JOptionPane.showMessageDialog(frame,frame.button3.getText());
	}


  }
});     

	// set visible all components 
	frame.setVisible(true);

   }// end main method 
}// end main class





class JavaSwing extends JFrame{
	JRadioButton button1,button2,button3;	
	ButtonGroup group;
void makeFrame(){
	setTitle("Suneel");
	setLayout(null);
	setSize(800,600);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
   }// end constructor 



void createRadioButtons(){

JLabel label1=new JLabel("Select Gender Type");
	label1.setBounds(50,10,150,30);
	add(label1);
	
	group = new ButtonGroup();
	
	button1=new JRadioButton("Male");
	button1.setBounds(50,40,150,20);
	add(button1);
	group.add(button1);


	button2=new JRadioButton("Female");
	button2.setBounds(50,60,150,20);
	add(button2);
	group.add(button2);


        button3=new JRadioButton("None");
	button3.setBounds(50,80,150,20);
	add(button3);
	group.add(button3);


}


}// end class



