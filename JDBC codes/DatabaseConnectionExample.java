import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionExample {
    public static void main(String[] args) {
        // Database connection parameters
        String url = "jdbc:mysql://localhost:3306/college";
        String user = "root";
        String password = "Kelash2936";
        
        // Using try-with-resources for automatic resource management
        try (Connection con = DriverManager.getConnection(url, user, password)) {
            // Load MySQL JDBC Driver (not required since JDBC 4.0 but good practice)
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Verify connection
            if (con != null && !con.isClosed()) {
                System.out.println("✅ Connected to MySQL Database Successfully!");
                
                // Get some connection metadata
                System.out.println("Database: " + con.getMetaData().getDatabaseProductName());
                System.out.println("Version: " + con.getMetaData().getDatabaseProductVersion());
                
                // You can now perform database operations here
            }
        } catch (ClassNotFoundException e) {
            System.err.println("❌ MySQL JDBC Driver not found!");
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println("❌ Connection Failed! Error details:");
            System.err.println("SQL State: " + e.getSQLState());
            System.err.println("Error Code: " + e.getErrorCode());
            System.err.println("Message: " + e.getMessage());
            e.printStackTrace();
        }
    }
}