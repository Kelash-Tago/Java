import javax.swing.*;
import java.awt.event.*;
public class nested4{
		public static void main(String args[]){
			JFrame frame= new JFrame("local class example");
			frame.setSize(300,200);
			frame.setLayout(null);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			JButton button = new JButton("click me");
			button.setBounds(20,30,100,50);
			frame.add(button);
		
			button.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					System.out.println("button clicked ");
					System.out.println("actionperfromed method called");
					System.out.println("anonymous class implementing actionlistener");



				}
			});
		
			
			frame.setVisible(true);
			
		
		}
	}