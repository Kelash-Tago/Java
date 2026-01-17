import java.sql.*;

public class FilterStudents {
    public static void main(String[] args) {
        String dbPath = "F:\\JDBC codes\\Database21.accdb";
        String url = "jdbc:ucanaccess://" + dbPath;
        
        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(
                 "SELECT SID, Name, Age FROM Student WHERE Age > 20 ORDER BY Age")) {
            
            System.out.println("Students with Age > 20:");
            System.out.println("-----------------------");
            System.out.printf("%-5s %-15s %s%n", "SID", "Name", "Age");
            System.out.println("-----------------------");
            
            while (rs.next()) {
                int sid = rs.getInt("SID");
                String name = rs.getString("Name");
                int age = rs.getInt("Age");
                System.out.printf("%-5d %-15s %d%n", sid, name, age);
            }
            
        } catch (SQLException e) {
            System.err.println("Database error:");
            e.printStackTrace();
        }
    }
}