import java.sql.*;

public class TestMySQL {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/college";
        String user = "root";
        String password = "Kelash2936";

        try {
            // 1. Load the driver (optional for JDBC 4.0+)
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // 2. Establish connection
            Connection conn = DriverManager.getConnection(url, user, password);
            
            // 3. Check if connection is successful
            if (conn != null) {
                System.out.println("✅ Connected to MySQL successfully!");
                
                // Optional: Run a test query
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT 1");
                if (rs.next()) {
                    System.out.println("Test query executed: " + rs.getInt(1));
                }
                
                // Close resources
                rs.close();
                stmt.close();
                conn.close();
            }
        } catch (Exception e) {
            System.err.println("❌ Connection failed!");
            e.printStackTrace();
        }
    }
}