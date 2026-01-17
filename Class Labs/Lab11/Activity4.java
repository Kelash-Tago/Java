import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class Activity4{
 
public static void main(String args[]){
MyFrame frame = new MyFrame();	
	frame.setVisible(true);
	
  }// end main method
}// end main class

class MyFrame extends JFrame{
public MyFrame(){
        setLayout(null);

	setSize(220,200);

	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	JButton jbtn=new JButton("Count");
	jbtn.setBounds(50,50,100,50);
	
	jbtn.addActionListener(new eventHandler());

	add(jbtn);

	

}// constructor
  }// jframe class end





class eventHandler implements ActionListener{
	public int count=0;
    public void actionPerformed(ActionEvent ae){
	count++;
	System.out.println("Clicks :  "+count);
   }
}