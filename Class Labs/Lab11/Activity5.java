import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
public class Activity5{
   public static void main(String args []){
	JFrame jfrm =new JFrame("JtextField");
	
	jfrm.setLayout(null);

	jfrm.setSize(220,200);

	jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	JTextField field1 = new JTextField("Test");
	field1.setBounds(50,50,100,50);
	
	field1.addActionListener(new eventHandler());

	jfrm.add(field1);

	jfrm.setVisible(true);


  }// end main method
}// end main class

class eventHandler implements ActionListener{
	public void actionPerformed(ActionEvent a){
	
	JTextField field2=(JTextField)a.getSource();
	System.out.println(field2.getText());
  }

}