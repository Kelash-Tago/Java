import javax.swing.*;
import java.awt.*;
import javax.swing.border.LineBorder;
import java.awt.event.*;



public class Activity1 extends JFrame implements MouseListener{
	JLabel label;
	 public Activity1(){
		setTitle("MouseListener Example");
		setSize(400,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setLayout(null);
			label=new JLabel("Click or Hover the mouse here");
			label.setBounds(100,100,200,30);
			add(label);
			
			label.addMouseListener(this);
			
			
			setVisible(true);
	}
	
	
	
	@Override
	public void mouseClicked(MouseEvent e){
		label.setText("Mouse Clicked ");
	}
	
	@Override
	public void mouseEntered(MouseEvent e){
		label.setText("Mouse Enetred");
	}
	
	@Override
	public void mousePressed(MouseEvent e){
		label.setText("Mouse mousePressed ");
	}
	
	@Override
	public void mouseExited(MouseEvent e){
		label.setText("Mouse Exited");
	}
	
	
	@Override
	public void mouseReleased(MouseEvent e){
		label.setText("Mouse Released");
	}
	
	
	public static void main(String args[]){
		new Activity1();
	}
}

/*
public interface MouseListener extends EventListener{
	void mousePressed(MouseEvent e);
	
	void mouseReleased(MouseEvent e);
	
	void mouseEntered(MouseEvent e);
	
	void mouseExited(MouseEvent e);
	
	void mouseClicked(MouseEvent e);
	
}
*/