import javax.swing.*;
import java.awt.event.*;

public class nested5{
		public static void main (String [] args){
				JFrame frame= new JFrame("mouse adapter example");
				frame.setSize(300,400);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
				JPanel panel= new JPanel();
				frame.add(panel);
			
				panel.addMouseListener(new MouseAdapter(){
					public void mouseclicked(MouseEvent e){
						System.out.println("mouse clicked at:"+e.getPoint());
						}
				public void mouseEntered(MouseEvent e){
					System.out.println("mouse entered the panel");
				}

		});
			frame.setVisible(true);
			}
		}