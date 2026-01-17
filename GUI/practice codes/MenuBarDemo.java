import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MenuBarDemo{
	public static void main(String args[]){
		JFrame frame=new JFrame();
		frame.setTitle("Menu Demo");
		frame.setSize(600,400);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		JMenuBar bar1 = new JMenuBar();
		
		frame.setJMenuBar(bar1);
		frame.setVisible(true);
	}// end main method
}