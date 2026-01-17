import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Activity1GUI {
    static Connection connection;
    static Statement stmt;
    
    // GUI Components
    private JFrame mainFrame;
    private JPanel mainPanel;
    private JButton searchButton, showAllButton, addButton, deleteButton, updateButton, exitButton;
    
    // Method for loading driver, getting connection and creating statement	
    static void initSetup() throws Exception {
        Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        String databasePath = "F:\\Class Labs\\lab10\\StudentsData1.accdb";
        String url = "jdbc:ucanaccess://" + databasePath;
        connection = DriverManager.getConnection(url);
        stmt = connection.createStatement();
    }
    
    // Constructor to setup the GUI
    public Activity1GUI() {
        try {
            initSetup();
            prepareGUI();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Database connection error: " + e.getMessage(), 
                                        "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void prepareGUI() {
        mainFrame = new JFrame("Student Management System");
        mainFrame.setSize(500, 400);
        mainFrame.setLayout(new BorderLayout());
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        mainPanel = new JPanel(new GridLayout(6, 1, 10, 10));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        
        // Create buttons
        searchButton = new JButton("Search Student");
        showAllButton = new JButton("Show All Students");
        addButton = new JButton("Add Student");
        deleteButton = new JButton("Delete Student");
        updateButton = new JButton("Update Student");
        exitButton = new JButton("Exit");
        
        // Add buttons to panel
        mainPanel.add(searchButton);
        mainPanel.add(showAllButton);
        mainPanel.add(addButton);
        mainPanel.add(deleteButton);
        mainPanel.add(updateButton);
        mainPanel.add(exitButton);
        
        // Add action listeners
        searchButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                searchStudent();
            }
        });
        
        showAllButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                showAllStudents();
            }
        });
        
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addStudent();
            }
        });
        
        deleteButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                deleteStudent();
            }
        });
        
        updateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                updateStudent();
            }
        });
        
        exitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    stmt.close();
                    connection.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
                mainFrame.dispose();
            }
        });
        
        mainFrame.add(mainPanel, BorderLayout.CENTER);
        mainFrame.setVisible(true);
    }
    
    // Method to display all students
    private void showAllStudents() {
        try {
            ResultSet rs = stmt.executeQuery("SELECT name, cms FROM students;");
            StringBuilder sb = new StringBuilder();
            sb.append("All Students:\n");
            sb.append("___________________________________\n");
            
            while (rs.next()) {
                sb.append("Name: ").append(rs.getString("Name")).append("\n");
                sb.append("CMS: ").append(rs.getString("CMS")).append("\n");
                sb.append("___________________________________\n");
            }
            
            JTextArea textArea = new JTextArea(sb.toString());
            textArea.setEditable(false);
            JScrollPane scrollPane = new JScrollPane(textArea);
            scrollPane.setPreferredSize(new Dimension(400, 300));
            JOptionPane.showMessageDialog(mainFrame, scrollPane, "All Students", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(mainFrame, "Error: " + e.getMessage(), 
                                        "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    // Method to add a new student
    private void addStudent() {
        JPanel panel = new JPanel(new GridLayout(2, 2, 5, 5));
        JTextField nameField = new JTextField();
        JTextField cmsField = new JTextField();
        
        panel.add(new JLabel("Name:"));
        panel.add(nameField);
        panel.add(new JLabel("CMS ID:"));
        panel.add(cmsField);
        
        int result = JOptionPane.showConfirmDialog(mainFrame, panel, "Add Student", 
                                                 JOptionPane.OK_CANCEL_OPTION);
        
        if (result == JOptionPane.OK_OPTION) {
            String name = nameField.getText().trim();
            String cms_id = cmsField.getText().trim();
            
            if (name.isEmpty() || cms_id.isEmpty()) {
                JOptionPane.showMessageDialog(mainFrame, "Name and CMS ID cannot be empty", 
                                            "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            try {
                String query = "INSERT INTO students (CMS, Name) VALUES ('" + cms_id + "', '" + name + "');";
                int affectedRows = stmt.executeUpdate(query);
                if (affectedRows > 0) {
                    JOptionPane.showMessageDialog(mainFrame, "Student added successfully!", 
                                                "Success", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(mainFrame, "Error: " + e.getMessage(), 
                                            "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    // Method to delete a student
    private void deleteStudent() {
        String cms_id = JOptionPane.showInputDialog(mainFrame, "Enter CMS ID to delete:", 
                                                  "Delete Student", JOptionPane.QUESTION_MESSAGE);
        
        if (cms_id != null && !cms_id.trim().isEmpty()) {
            try {
                String query = "DELETE FROM students WHERE CMS='" + cms_id + "';";
                int affectedRows = stmt.executeUpdate(query);
                if (affectedRows > 0) {
                    JOptionPane.showMessageDialog(mainFrame, "Student deleted successfully!", 
                                                "Success", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(mainFrame, "No student found with CMS ID: " + cms_id, 
                                                "Not Found", JOptionPane.WARNING_MESSAGE);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(mainFrame, "Error: " + e.getMessage(), 
                                            "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    // Method to update a student
    private void updateStudent() {
        Object[] options = {"Update Name", "Update CMS", "Cancel"};
        int choice = JOptionPane.showOptionDialog(mainFrame, "What would you like to update?", 
                                               "Update Student", JOptionPane.DEFAULT_OPTION, 
                                               JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        
        if (choice == 0) { // Update Name
            JPanel panel = new JPanel(new GridLayout(2, 2, 5, 5));
            JTextField cmsField = new JTextField();
            JTextField nameField = new JTextField();
            
            panel.add(new JLabel("Current CMS ID:"));
            panel.add(cmsField);
            panel.add(new JLabel("New Name:"));
            panel.add(nameField);
            
            int result = JOptionPane.showConfirmDialog(mainFrame, panel, "Update Name", 
                                                     JOptionPane.OK_CANCEL_OPTION);
            
            if (result == JOptionPane.OK_OPTION) {
                String cms = cmsField.getText().trim();
                String name = nameField.getText().trim();
                
                if (cms.isEmpty() || name.isEmpty()) {
                    JOptionPane.showMessageDialog(mainFrame, "CMS ID and Name cannot be empty", 
                                                "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                
                try {
                    String query = "UPDATE students SET Name='" + name + "' WHERE CMS='" + cms + "';";
                    int affectedRows = stmt.executeUpdate(query);
                    if (affectedRows > 0) {
                        JOptionPane.showMessageDialog(mainFrame, "Name updated successfully!", 
                                                      "Success", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(mainFrame, "No student found with CMS ID: " + cms, 
                                                    "Not Found", JOptionPane.WARNING_MESSAGE);
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(mainFrame, "Error: " + e.getMessage(), 
                                                "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else if (choice == 1) { // Update CMS
            JPanel panel = new JPanel(new GridLayout(2, 2, 5, 5));
            JTextField cmsField = new JTextField();
            JTextField newCmsField = new JTextField();
            
            panel.add(new JLabel("Current CMS ID:"));
            panel.add(cmsField);
            panel.add(new JLabel("New CMS ID:"));
            panel.add(newCmsField);
            
            int result = JOptionPane.showConfirmDialog(mainFrame, panel, "Update CMS", 
                                                     JOptionPane.OK_CANCEL_OPTION);
            
            if (result == JOptionPane.OK_OPTION) {
                String cms = cmsField.getText().trim();
                String newCms = newCmsField.getText().trim();
                
                if (cms.isEmpty() || newCms.isEmpty()) {
                    JOptionPane.showMessageDialog(mainFrame, "CMS IDs cannot be empty", 
                                                "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                
                try {
                    String query = "UPDATE students SET CMS='" + newCms + "' WHERE CMS='" + cms + "';";
                    int affectedRows = stmt.executeUpdate(query);
                    if (affectedRows > 0) {
                        JOptionPane.showMessageDialog(mainFrame, "CMS ID updated successfully!", 
                                                      "Success", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(mainFrame, "No student found with CMS ID: " + cms, 
                                                    "Not Found", JOptionPane.WARNING_MESSAGE);
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(mainFrame, "Error: " + e.getMessage(), 
                                                "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }
    
    // Method to search for a student
    private void searchStudent() {
        Object[] options = {"Search by Name", "Search by CMS", "Cancel"};
        int choice = JOptionPane.showOptionDialog(mainFrame, "How would you like to search?", 
                                               "Search Student", JOptionPane.DEFAULT_OPTION, 
                                               JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        
        if (choice == 0) { // Search by Name
            String name = JOptionPane.showInputDialog(mainFrame, "Enter name to search:", 
                                                    "Search by Name", JOptionPane.QUESTION_MESSAGE);
            
            if (name != null && !name.trim().isEmpty()) {
                try {
                    String query = "SELECT name, cms FROM students WHERE Name LIKE '%" + name + "%';";
                    ResultSet rs = stmt.executeQuery(query);
                    
                    StringBuilder sb = new StringBuilder();
                    boolean found = false;
                    
                    while (rs.next()) {
                        found = true;
                        sb.append("Name: ").append(rs.getString("Name")).append("\n");
                        sb.append("CMS: ").append(rs.getString("CMS")).append("\n");
                        sb.append("___________________________________\n");
                    }
                    
                    if (found) {
                        JTextArea textArea = new JTextArea(sb.toString());
                        textArea.setEditable(false);
                        JScrollPane scrollPane = new JScrollPane(textArea);
                        scrollPane.setPreferredSize(new Dimension(400, 300));
                        JOptionPane.showMessageDialog(mainFrame, scrollPane, "Search Results", 
                                                    JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(mainFrame, "No students found with name: " + name, 
                                                    "Not Found", JOptionPane.WARNING_MESSAGE);
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(mainFrame, "Error: " + e.getMessage(), 
                                                "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else if (choice == 1) { // Search by CMS
            String cms = JOptionPane.showInputDialog(mainFrame, "Enter CMS ID to search:", 
                                                  "Search by CMS", JOptionPane.QUESTION_MESSAGE);
            
            if (cms != null && !cms.trim().isEmpty()) {
                try {
                    String query = "SELECT name, cms FROM students WHERE CMS='" + cms + "';";
                    ResultSet rs = stmt.executeQuery(query);
                    
                    if (rs.next()) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Student Found:\n");
                        sb.append("___________________________________\n");
                        sb.append("Name: ").append(rs.getString("Name")).append("\n");
                        sb.append("CMS: ").append(rs.getString("CMS")).append("\n");
                        sb.append("___________________________________\n");
                        
                        JOptionPane.showMessageDialog(mainFrame, sb.toString(), 
                                                    "Search Results", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(mainFrame, "No student found with CMS ID: " + cms, 
                                                    "Not Found", JOptionPane.WARNING_MESSAGE);
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(mainFrame, "Error: " + e.getMessage(), 
                                                "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Activity1GUI();
            }
        });
    }
}