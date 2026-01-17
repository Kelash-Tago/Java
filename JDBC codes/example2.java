import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class example2 {
    public static void main(String[] args) {
        // Database connection parameters
        String url = "jdbc:mysql://localhost:3306/college";
        String user = "root";
        String password = "Kelash2936";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            // Get database metadata
            DatabaseMetaData meta = conn.getMetaData();
            
            // Retrieve table information
            try (ResultSet rs = meta.getTables(conn.getCatalog(), null, "%", new String[]{"TABLE"})) {
                System.out.println("Tables in database '" + conn.getCatalog() + "':");
                
                // Iterate through all tables
                while (rs.next()) {
                    String tableName = rs.getString("TABLE_NAME");
                    System.out.println("- " + tableName);
                }
            }
        } catch (SQLException e) {
            System.err.println("Database error:");
            e.printStackTrace();
        }
    }
}