import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class CheckBox {
    public static void main(String args[]){
	JavaSwing frame = new JavaSwing();
	frame.makeFrame();
	frame.createCheckBox();
	
	JButton button1 =new JButton("Total");
	button1.setBounds(50,110,80,30);
	frame.add(button1);  
	
	button1.addActionListener(new ActionListener(){
	@Override
        public void actionPerformed(ActionEvent e){


	double amount=0;
	String msg="";
	if(frame.checkBoxOne.isSelected()){
	amount+=100;
	msg+="Pizza 100 rupees.\n";}
	if(frame.checkBoxTwo.isSelected()){
	amount+=150;
	msg+="Burger 150 rupees.\n";}

	if(frame.checkBoxThree.isSelected()){
	amount+=200;
        msg+="Chicken 200 rupees.\n";}

	//System.out.println(msg);
       // System.out.print("Total amount is : "+amount);
	JOptionPane.showMessageDialog(frame,msg+"Total : "+amount);
  }

});
	

	// set visible all components 
	frame.setVisible(true);

   }// end main method 
}// end main class

class JavaSwing extends JFrame{
	JCheckBox checkBoxOne,checkBoxTwo,checkBoxThree;
	
void makeFrame(){
	setTitle("Suneel");
	setLayout(null);
	setSize(800,600);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
   }// end constructor 



void createCheckBox(){

JLabel label1=new JLabel("Food Billing");
	label1.setBounds(50,10,150,30);
	add(label1);

	checkBoxOne=new JCheckBox("Pizza 100");
	checkBoxOne.setBounds(50,40,150,20);
	add(checkBoxOne);

	checkBoxTwo=new JCheckBox("Burger 150");
	checkBoxTwo.setBounds(50,60,150,20);
	add(checkBoxTwo);

        checkBoxThree=new JCheckBox("Chicken 200");
	checkBoxThree.setBounds(50,80,150,20);
	add(checkBoxThree);


}


}// end class