import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class AutoCloseDemo2 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String password = "2006";

        try (Connection con = DriverManager.getConnection(url, user, password);
             Statement stmt = con.createStatement()) {
            String sql = "insert into users(id, name) values(1, 'John')";
            int rows = stmt.executeUpdate(sql);
            System.out.println("Rows inserted: " + rows);
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }
}
