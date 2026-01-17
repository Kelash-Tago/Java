import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class EventHandling{
    public static void main(String args[]){
	JavaSwing frame = new JavaSwing();
        frame.makeFrame();
        frame.createRadioButtons();  // Uncommented to show both components
        frame.createComboBox();
        frame.setVisible(true);
  

   }//end main method 
}//end main class


class JavaSwing extends JFrame {
    // Radio Button Components
    JRadioButton button1, button2, button3;    
    ButtonGroup group;
    
    // Combo Box Components
    JComboBox<String> box1;
    JLabel comboLabel;
    JButton comboButton;
    
    void makeFrame() {
        setTitle("Suneel's GUI Application");
        setLayout(null);
        setSize(400, 300);  // Adjusted size for better layout
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
    }
    
    void createRadioButtons() {
        // Gender Selection Label
        JLabel genderLabel = new JLabel("Select Gender:");
        genderLabel.setBounds(50, 20, 150, 20);
        add(genderLabel);
        
        // Radio Buttons
        group = new ButtonGroup();
        
        button1 = new JRadioButton("Male");
        button1.setBounds(50, 50, 100, 20);
        add(button1);
        group.add(button1);
        
        button2 = new JRadioButton("Female");
        button2.setBounds(50, 80, 100, 20);
        add(button2);
        group.add(button2);
        
        button3 = new JRadioButton("Other");
        button3.setBounds(50, 110, 100, 20);
        add(button3);
        group.add(button3);
        
        // Radio Button Submit Button
        JButton radioButton = new JButton("Submit Gender");
        radioButton.setBounds(50, 140, 150, 30);
        add(radioButton);
	radioButton.addActionListener(new RadioButtonEventHandler(this));
    }
    
    void createComboBox() {
        // City Selection Label
        JLabel cityLabel = new JLabel("Select City:");
        cityLabel.setBounds(200, 20, 150, 20);
        add(cityLabel);
        
        // Combo Box
        String cities[] = {"Naukot", "Mithi", "Nagarparkar", "Jhuddo", "Digri", "DanoDhandal", "Choryo"};
        box1 = new JComboBox<>(cities);
        box1.setBounds(200, 50, 150, 30);
        add(box1);
        
        // Combo Box Label for display
        comboLabel = new JLabel("");
        comboLabel.setBounds(200, 90, 200, 20);
        add(comboLabel);
        
        // Combo Box Submit Button
        comboButton = new JButton("Submit City");
        comboButton.setBounds(200, 130, 150, 30);
        comboButton.addActionListener(new ComboBoxEventHandler(this));
        add(comboButton);
    }
}// javaswing class end

class RadioButtonEventHandler implements ActionListener{
	private JavaSwing frame;
	public RadioButtonEventHandler(JavaSwing frame){
	this.frame=frame;
}

public void actionPerformed(ActionEvent a){
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


}// end radio action class

class ComboBoxEventHandler implements ActionListener{
	private JavaSwing frame;
   public ComboBoxEventHandler(JavaSwing frame){
	this.frame=frame;
  }  
public void actionPerformed(ActionEvent a){
      String str=(String)frame.box1.getSelectedItem();
	JOptionPane.showMessageDialog(frame,"You selected : "+str);
   }

}

