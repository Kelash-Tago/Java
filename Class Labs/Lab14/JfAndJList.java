import javax.swing.*;
import java.awt.*;
import java.Event.*;


public class JfAndJList(
    public static void main(String args[]) {
    // Create a new JFrame container.
    JFrame jfm = new JFrame("JComboBox");
    // Specify layout for frame.
    jfm.setlayout(null);
    // Give the frame an initial size.
    jfm.setSize(220, 200);
    // Terminate the program when the user closes the application.
    jfm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // Make list of cities for JList
    String[] listOfCities = ("Karachi","Sukkur","Hyderabad","Larkana");
    // Make a JList
    JList city= new JList(listOfCities);
    // Select location and size of JList on frame
    city.setBounds(50,50,100,50);
    // Set selection mode for JList
    city.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    // register action listener with event source
    city.addListSelectionListener(new eventHandler());
    JScrollPane jsp = new JScrollPane(city);
    jsp.setBounds(50,50,100,50);
    // Add the JScrollPane containing JList to the content pane.
    jfm.add(jsp);
    //display the frame
    jfm.setVisible(true);
    }
    class eventHandler implements ListSelectionListener(
    public void valueChanged(ListSelectionEvent lse){
    JList jlist=(JList)lse.getSource();
    if(jlist.getValueIsAdjusting()==false){
    System.out.println(jlist.getSelectedValue() + 
    -- and its index is: " + jlist.getSelectedIndex());
    }
    }
    }
}