import javax.swing.SwingUtilities;

/**
 * Main application class for the User Authentication System.
 * This class serves as the entry point for the application.
 */
public class UserAuthApp {
    
    /**
     * Main method to start the application.
     * @param args Command line arguments (not used)
     */
    public static void main(String[] args) {
        // Use the Event Dispatch Thread for Swing applications
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                // Start with the login page
                new LoginPage().setVisible(true);
            }
        });
    }
} 