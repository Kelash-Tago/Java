import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.regex.Pattern;

public class SignupPage extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JPasswordField confirmPasswordField;
    private JTextField emailField;
    private JTextField fullNameField;
    private JComboBox<String> genderComboBox;
    private JButton signupButton;
    private JButton cancelButton;
    private JCheckBox showPassword;
    private JLabel statusLabel;

    // Email validation pattern
    private static final Pattern EMAIL_PATTERN = 
        Pattern.compile("^[A-Za-z0-9+_.-]+@(.+)$");

    public SignupPage() {
        // Set up the frame
        setTitle("User Registration");
        setSize(500, 500);
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
        JLabel titleLabel = new JLabel("Create New Account");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel.setForeground(Color.WHITE);
        titlePanel.add(titleLabel);

        // Create the form panel
        JPanel formPanel = new JPanel();
        formPanel.setLayout(null); // Using absolute positioning
        formPanel.setBackground(new Color(240, 248, 255));

        // Full Name label and field
        JLabel fullNameLabel = new JLabel("Full Name:");
        fullNameLabel.setBounds(50, 30, 150, 25);
        formPanel.add(fullNameLabel);

        fullNameField = new JTextField();
        fullNameField.setBounds(200, 30, 250, 25);
        formPanel.add(fullNameField);

        // Username label and field
        JLabel usernameLabel = new JLabel("Username:");
        usernameLabel.setBounds(50, 70, 150, 25);
        formPanel.add(usernameLabel);

        usernameField = new JTextField();
        usernameField.setBounds(200, 70, 250, 25);
        formPanel.add(usernameField);

        // Email label and field
        JLabel emailLabel = new JLabel("Email:");
        emailLabel.setBounds(50, 110, 150, 25);
        formPanel.add(emailLabel);

        emailField = new JTextField();
        emailField.setBounds(200, 110, 250, 25);
        formPanel.add(emailField);

        // Gender label and combo box
        JLabel genderLabel = new JLabel("Gender:");
        genderLabel.setBounds(50, 150, 150, 25);
        formPanel.add(genderLabel);

        String[] genders = {"Select Gender", "Male", "Female", "Other", "Prefer not to say"};
        genderComboBox = new JComboBox<>(genders);
        genderComboBox.setBounds(200, 150, 250, 25);
        formPanel.add(genderComboBox);

        // Password label and field
        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(50, 190, 150, 25);
        formPanel.add(passwordLabel);

        passwordField = new JPasswordField();
        passwordField.setBounds(200, 190, 250, 25);
        formPanel.add(passwordField);

        // Confirm Password label and field
        JLabel confirmPasswordLabel = new JLabel("Confirm Password:");
        confirmPasswordLabel.setBounds(50, 230, 150, 25);
        formPanel.add(confirmPasswordLabel);

        confirmPasswordField = new JPasswordField();
        confirmPasswordField.setBounds(200, 230, 250, 25);
        formPanel.add(confirmPasswordField);

        // Show password checkbox
        showPassword = new JCheckBox("Show Password");
        showPassword.setBounds(200, 270, 150, 25);
        showPassword.setBackground(new Color(240, 248, 255));
        showPassword.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (showPassword.isSelected()) {
                    passwordField.setEchoChar((char) 0);
                    confirmPasswordField.setEchoChar((char) 0);
                } else {
                    passwordField.setEchoChar('•');
                    confirmPasswordField.setEchoChar('•');
                }
            }
        });
        formPanel.add(showPassword);

        // Terms and conditions checkbox
        JCheckBox termsCheckBox = new JCheckBox("I agree to the Terms and Conditions");
        termsCheckBox.setBounds(200, 300, 250, 25);
        termsCheckBox.setBackground(new Color(240, 248, 255));
        formPanel.add(termsCheckBox);

        // Signup button
        signupButton = new JButton("Sign Up");
        signupButton.setBounds(200, 340, 100, 30);
        signupButton.setBackground(new Color(70, 130, 180));
        signupButton.setForeground(Color.WHITE);
        signupButton.setFocusPainted(false);
        signupButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (validateForm(termsCheckBox.isSelected())) {
                    // Here you would typically save the user data to a database
                    statusLabel.setText("Registration successful!");
                    statusLabel.setForeground(new Color(0, 128, 0)); // Dark green
                    
                    JOptionPane.showMessageDialog(SignupPage.this, 
                        "Account created successfully!\nYou can now login with your credentials.", 
                        "Registration Successful", 
                        JOptionPane.INFORMATION_MESSAGE);
                    
                    // Open login page and close signup page
                    new LoginPage().setVisible(true);
                    dispose();
                }
            }
        });
        formPanel.add(signupButton);

        // Cancel button
        cancelButton = new JButton("Cancel");
        cancelButton.setBounds(310, 340, 100, 30);
        cancelButton.setBackground(new Color(220, 220, 220));
        cancelButton.setFocusPainted(false);
        cancelButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Open login page and close signup page
                new LoginPage().setVisible(true);
                dispose();
            }
        });
        formPanel.add(cancelButton);

        // Status label for displaying messages
        statusLabel = new JLabel("");
        statusLabel.setBounds(50, 380, 400, 25);
        statusLabel.setHorizontalAlignment(SwingConstants.CENTER);
        formPanel.add(statusLabel);

        // Add panels to the main panel
        mainPanel.add(titlePanel, BorderLayout.NORTH);
        mainPanel.add(formPanel, BorderLayout.CENTER);

        // Add the main panel to the frame
        add(mainPanel);
    }

    private boolean validateForm(boolean termsAccepted) {
        // Get form values
        String fullName = fullNameField.getText().trim();
        String username = usernameField.getText().trim();
        String email = emailField.getText().trim();
        String gender = (String) genderComboBox.getSelectedItem();
        String password = new String(passwordField.getPassword());
        String confirmPassword = new String(confirmPasswordField.getPassword());

        // Validate full name
        if (fullName.isEmpty()) {
            statusLabel.setText("Please enter your full name");
            statusLabel.setForeground(Color.RED);
            return false;
        }

        // Validate username
        if (username.isEmpty()) {
            statusLabel.setText("Please enter a username");
            statusLabel.setForeground(Color.RED);
            return false;
        }

        if (username.length() < 4) {
            statusLabel.setText("Username must be at least 4 characters long");
            statusLabel.setForeground(Color.RED);
            return false;
        }

        // Validate email
        if (email.isEmpty()) {
            statusLabel.setText("Please enter your email address");
            statusLabel.setForeground(Color.RED);
            return false;
        }

        if (!EMAIL_PATTERN.matcher(email).matches()) {
            statusLabel.setText("Please enter a valid email address");
            statusLabel.setForeground(Color.RED);
            return false;
        }

        // Validate gender
        if (gender.equals("Select Gender")) {
            statusLabel.setText("Please select your gender");
            statusLabel.setForeground(Color.RED);
            return false;
        }

        // Validate password
        if (password.isEmpty()) {
            statusLabel.setText("Please enter a password");
            statusLabel.setForeground(Color.RED);
            return false;
        }

        if (password.length() < 6) {
            statusLabel.setText("Password must be at least 6 characters long");
            statusLabel.setForeground(Color.RED);
            return false;
        }

        // Validate confirm password
        if (!password.equals(confirmPassword)) {
            statusLabel.setText("Passwords do not match");
            statusLabel.setForeground(Color.RED);
            return false;
        }

        // Validate terms and conditions
        if (!termsAccepted) {
            statusLabel.setText("You must accept the Terms and Conditions");
            statusLabel.setForeground(Color.RED);
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        // Use the Event Dispatch Thread for Swing applications
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SignupPage().setVisible(true);
            }
        });
    }
} 