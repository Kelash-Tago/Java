import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Calculator{
	public static void main(String args []){
		JFrame frame=new JFrame();
		frame.setTitle("Simple Calculator");
		frame.setLayout(null);
		frame.setSize(400,500);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		
		JTextField field1 = new JTextField();
		field1.setBounds(50,20,260,40);
		frame.add(field1);
		
		
		JTextField field2 = new JTextField();
		field2.setBounds(50,70,260,40);
		frame.add(field2);
		
		JTextField field3 = new JTextField();
		field3.setBounds(50,120,260,40);
		frame.add(field3);
		
		JButton add = new JButton("Add");
		add.setBounds(50,170,60,40);
		frame.add(add);
		add.addActionListener(new Addition(frame,field1,field2,field3));
		
		JButton sub = new JButton("Sub");
		sub.setBounds(115,170,60,40);
		frame.add(sub);
		sub.addActionListener(new Subtraction(frame,field1,field2,field3));
		
		JButton div = new JButton("Div");
		div.setBounds(180,170,60,40);
		frame.add(div);
	        div.addActionListener(new Division(frame,field1,field2,field3));


		JButton mul = new JButton("Mul");
		mul.setBounds(245,170,60,40);
		frame.add(mul);
		mul.addActionListener(new Multiplication(frame,field1,field2,field3));

		// i have added this so that no one can set textfield on gui frame
	    field3.setEditable(false);
		frame.setVisible(true);
	}// end main method

}// end main class

class Addition implements ActionListener{
	private JFrame frame;
	private JTextField field1,field2,field3;
	
	public Addition(JFrame frame,JTextField field1,JTextField field2,JTextField field3){
		this.frame=frame;
		this.field1=field1;
		this.field2=field2;
		this.field3=field3;
	}
      public void actionPerformed(ActionEvent e){
		  int num1=Integer.parseInt(field1.getText());
		  int num2=Integer.parseInt(field2.getText());
		  int sum=num1+num2;
		  field3.setText("Addition is : "+sum);
		  //System.out.println("The sum of integers is  "+(num1+num2));
		  
	  }
	   
}



class Subtraction implements ActionListener{
	private JFrame frame;
	private JTextField field1,field2,field3;
	
	public Subtraction(JFrame frame,JTextField field1,JTextField field2,JTextField field3){
		this.frame=frame;
		this.field1=field1;
		this.field2=field2;
		this.field3=field3;
	}
      public void actionPerformed(ActionEvent e){
		  int num1=Integer.parseInt(field1.getText());
		  int num2=Integer.parseInt(field2.getText());
		  int num3=num1-num2;
		  field3.setText("Subtraction is : "+num3);		  
	  }   
}


class Division implements ActionListener{
	private JFrame frame;
	private JTextField field1,field2,field3;
	
	public Division(JFrame frame,JTextField field1,JTextField field2,JTextField field3){
		this.frame=frame;
		this.field1=field1;
		this.field2=field2;
		this.field3=field3;
	}
      public void actionPerformed(ActionEvent e){
		  int num1=Integer.parseInt(field1.getText());
		  int num2=Integer.parseInt(field2.getText());
		  int quotient=num1/num2;
		  field3.setText("Division is : "+quotient);
		  
	  }  
}
class Multiplication implements ActionListener{
	private JFrame frame;
	private JTextField field1,field2,field3;
	
	public Multiplication(JFrame frame,JTextField field1,JTextField field2,JTextField field3){
		this.frame=frame;
		this.field1=field1;
		this.field2=field2;
		this.field3=field3;
	}
      public void actionPerformed(ActionEvent e){
		  int num1=Integer.parseInt(field1.getText());
		  int num2=Integer.parseInt(field2.getText());
		  int num3=num1*num2;
		  field3.setText("Multiplication is : "+num3);		  
	  }
	   
}