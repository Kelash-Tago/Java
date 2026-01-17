import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class calculatorWindow extends JFrame{
		JTextField tf1;
		JTextField tf2;
		JTextField tf3;
	calculatorWindow(){
			setLayout(null);
			setSize(500,300);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			tf1=new JTextField();
			tf1.setBounds(100,30,250,40);
			tf2=new JTextField();
			tf2.setBounds(100,80,250,40);
			tf3=new JTextField();
			tf3.setBounds(100,130,250,40);
			tf3.setEditable(false);

			JButton jb1= new JButton("add");
			jb1.setBounds(80,180,60,40);

			JButton jb2= new JButton("sub");
			jb2.setBounds(165,180,60,40);

			JButton jb3= new JButton("mul");
			jb3.setBounds(230,180,60,40);

			JButton jb4= new JButton("div");
			jb4.setBounds(295,180,60,40);

			eventHandler evtH= new eventHandler();
			jb1.addActionListener(evtH);
			jb2.addActionListener(evtH);
			jb3.addActionListener(evtH);
			jb4.addActionListener(evtH);
			add(tf1);
			add(tf2);
			add(tf3);
			add(jb4);
			add(jb1);
			add(jb2);
			add(jb3);
			setVisible(true);
				}
class eventHandler implements ActionListener{
			public void actionPerformed (ActionEvent ae){
				int value1=Integer.parseInt(tf1.getText());
				int value2=Integer.parseInt(tf2.getText());

		if(((JButton)ae.getSource()).getText().equalsIgnoreCase("add")){
			int value3=value1+value2;
			tf3.setText("Addition is: "+ value3);
				}
		else if(((JButton)ae.getSource()).getText().equalsIgnoreCase("sub")){
			int value3=value1-value2;
			tf3.setText("subtraction is: "+ value3);
					}
		else if(((JButton)ae.getSource()).getText().equalsIgnoreCase("mul")){
			int value3=value1*value2;
						
			tf3.setText("multiplication is: "+ value3);
				}
		else if(((JButton)ae.getSource()).getText().equalsIgnoreCase("div")){
			int value3=value1/value2;
			tf3.setText("division is: "+ value3);
			}
		}
	}
}

public class calculator{
			public static void main(String args[]){
				new calculatorWindow();
					}
				}