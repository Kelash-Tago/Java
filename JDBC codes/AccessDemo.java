import java.sql.*;

public class AccessDemo {
    public static void main(String[] args) {
        // Update this path!
        String dbPath = "C:/Users/Admin/Documents/mydatabase.accdb"; 
        String url = "jdbc:ucanaccess://" + dbPath;

        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM Customers")) {
            
            while (rs.next()) {
                System.out.println(rs.getString("CustomerName"));
            }
        } catch (SQLException e) {
            System.err.println("Error accessing database:");
            System.err.println("Path attempted: " + dbPath);
            e.printStackTrace();
        }
    }
}