import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginPage extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JButton resetButton;
    private JCheckBox showPassword;
    private JLabel statusLabel;

    public LoginPage() {
        // Set up the frame
        setTitle("Login System");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the window
        setResizable(false);

        // Create the main panel with a nice background color
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(new Color(240, 248, 255)); // Light blue background

        // Create a panel for the title
        JPanel titlePanel = new JPanel();
        titlePanel.setBackground(new Color(70, 130, 180)); // Steel blue
        JLabel titleLabel = new JLabel("User Login");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel.setForeground(Color.WHITE);
        titlePanel.add(titleLabel);

        // Create the form panel
        JPanel formPanel = new JPanel();
        formPanel.setLayout(null); // Using absolute positioning
        formPanel.setBackground(new Color(240, 248, 255));

        // Username label and field
        JLabel usernameLabel = new JLabel("Username:");
        usernameLabel.setBounds(50, 30, 100, 25);
        formPanel.add(usernameLabel);

        usernameField = new JTextField();
        usernameField.setBounds(150, 30, 200, 25);
        formPanel.add(usernameField);

        // Password label and field
        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(50, 70, 100, 25);
        formPanel.add(passwordLabel);

        passwordField = new JPasswordField();
        passwordField.setBounds(150, 70, 200, 25);
        formPanel.add(passwordField);

        // Show password checkbox
        showPassword = new JCheckBox("Show Password");
        showPassword.setBounds(150, 100, 150, 25);
        showPassword.setBackground(new Color(240, 248, 255));
        showPassword.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (showPassword.isSelected()) {
                    passwordField.setEchoChar((char) 0);
                } else {
                    passwordField.setEchoChar('•');
                }
            }
        });
        formPanel.add(showPassword);

        // Login button
        loginButton = new JButton("Login");
        loginButton.setBounds(150, 140, 100, 30);
        loginButton.setBackground(new Color(70, 130, 180));
        loginButton.setForeground(Color.WHITE);
        loginButton.setFocusPainted(false);
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());
                
                if (username.trim().isEmpty() || password.trim().isEmpty()) {
                    statusLabel.setText("Please enter both username and password");
                    statusLabel.setForeground(Color.RED);
                } else {
                    // Here you would typically validate against a database
                    // For demo purposes, we'll use a simple check
                    if (username.equals("admin") && password.equals("password")) {
                        statusLabel.setText("Login successful!");
                        statusLabel.setForeground(new Color(0, 128, 0)); // Dark green
                        JOptionPane.showMessageDialog(LoginPage.this, 
                            "Welcome, " + username + "!", 
                            "Login Successful", 
                            JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        statusLabel.setText("Invalid username or password");
                        statusLabel.setForeground(Color.RED);
                    }
                }
            }
        });
        formPanel.add(loginButton);

        // Reset button
        resetButton = new JButton("Reset");
        resetButton.setBounds(260, 140, 100, 30);
        resetButton.setBackground(new Color(220, 220, 220));
        resetButton.setFocusPainted(false);
        resetButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                usernameField.setText("");
                passwordField.setText("");
                statusLabel.setText("");
                usernameField.requestFocus();
            }
        });
        formPanel.add(resetButton);

        // Status label for displaying messages
        statusLabel = new JLabel("");
        statusLabel.setBounds(50, 180, 300, 25);
        statusLabel.setHorizontalAlignment(SwingConstants.CENTER);
        formPanel.add(statusLabel);

        // Add "Don't have an account? Sign up" link
        JPanel signupLinkPanel = new JPanel();
        signupLinkPanel.setBackground(new Color(240, 248, 255));
        JLabel signupLabel = new JLabel("Don't have an account?");
        signupLabel.setForeground(Color.BLACK);
        signupLinkPanel.add(signupLabel);
        
        JButton signupLink = new JButton("Sign up");
        signupLink.setBorderPainted(false);
        signupLink.setContentAreaFilled(false);
        signupLink.setFocusPainted(false);
        signupLink.setForeground(new Color(0, 0, 255)); // Blue color for link
        signupLink.setCursor(new Cursor(Cursor.HAND_CURSOR));
        signupLink.setFont(new Font("Arial", Font.BOLD, 12));
        signupLink.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Open signup page and close login page
                new SignupPage().setVisible(true);
                dispose();
            }
        });
        signupLinkPanel.add(signupLink);
        
        // Add panels to the main panel
        mainPanel.add(titlePanel, BorderLayout.NORTH);
        mainPanel.add(formPanel, BorderLayout.CENTER);
        mainPanel.add(signupLinkPanel, BorderLayout.SOUTH);

        // Add the main panel to the frame
        add(mainPanel);
    }

    public static void main(String[] args) {
        // Use the Event Dispatch Thread for Swing applications
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true);
            }
        });
    }
} 