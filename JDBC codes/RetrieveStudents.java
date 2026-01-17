import java.sql.*;

public class RetrieveStudents {
    public static void main(String[] args) {
        // Path to your Access database file
        String dbPath = "F:\\JDBC codes\\Database21.accdb";
        String url = "jdbc:ucanaccess://" + dbPath;
        
        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT Name, Age FROM Student where name like 'Kelash'")) {
            
            System.out.println("Student Records:");
            System.out.println("----------------");
            System.out.printf("%-15s %s%n", "Name", "Age");
            System.out.println("----------------");
            
            while (rs.next()) {
                String name = rs.getString("Name");
                int age = rs.getInt("Age");
                System.out.printf("%-15s %d%n", name, age);
            }
            
        } catch (SQLException e) {
            System.err.println("Database error:");
            e.printStackTrace();
        }
    }
}