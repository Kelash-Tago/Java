import java.sql.*;

public class EstablishConnection {
    public static void main(String args[]) throws ClassNotFoundException {
        String url = "jdbc:mysql://localhost:3306/hr";
        String username = "root";
        String password = "Kelash2936";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Drivers loaded Successfully....");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver loading failed: " + e.getMessage());
            return;
        }

        try (
            Connection conn = DriverManager.getConnection(url, username, password);
            Statement stmt = conn.createStatement();
        ) {
            System.out.println("Connection Established Successfully....");
            System.out.println("Statement created Successfully....");

            String query = "SELECT First_name FROM employees;";
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                System.out.println(rs.getString("First_name"));
            }

            rs.close(); // It's good practice to close ResultSet when done.

        } catch (SQLException s) {
            System.out.println("SQL Error: " + s.getMessage());
        }
    }
}
