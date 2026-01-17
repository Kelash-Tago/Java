import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class example3 {
    public static void main(String[] args) {
        // Database connection parameters
        String url = "jdbc:mysql://localhost:3306/hr";
        String user = "root";
        String password = "Kelash2936";
        String tableName = "employees"; // Change to your table name

        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement()) {
            
            // SQL query to select first and last names
            String sql = "SELECT first_name, last_name FROM " + tableName;
            
            try (ResultSet rs = stmt.executeQuery(sql)) {
                System.out.println("First Name\tLast Name");
                System.out.println("-------------------------");
                
                // Iterate through the result set
                while (rs.next()) {
                    String firstName = rs.getString("first_name");
                    String lastName = rs.getString("last_name");
                    System.out.printf("%-12s\t%s%n", firstName, lastName);
                }
            }
        } catch (SQLException e) {
            System.err.println("Database error:");
            e.printStackTrace();
        }
    }
}