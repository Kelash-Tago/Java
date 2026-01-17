import java.sql.*;
import java.util.Scanner;

public class LoginSystem {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/MyDB";
    private static final String DB_USER = "root"; // Change this to your MySQL username
    private static final String DB_PASSWORD = "Kelash2936"; // Change this to your MySQL password

    public static void main(String[] args) {
        try {
            // Load MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Create database and table if they don't exist
            createDatabaseAndTable();
            
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("\n=== Login System ===");
                System.out.println("1. Register");
                System.out.println("2. Login");
                System.out.println("3. Exit");
                System.out.print("Choose an option: ");
                
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                
                switch (choice) {
                    case 1:
                        registerUser(scanner);
                        break;
                    case 2:
                        loginUser(scanner);
                        break;
                    case 3:
                        System.out.println("Exiting...");
                        return;
                    default:
                        System.out.println("Invalid choice!");
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void createDatabaseAndTable() throws SQLException {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/", DB_USER, DB_PASSWORD);
             Statement stmt = conn.createStatement()) {
            
            // Create database if it doesn't exist
            stmt.executeUpdate("CREATE DATABASE IF NOT EXISTS MyDB");
            
            // Use the database
            stmt.executeUpdate("USE MyDB");
            
            // Create table if it doesn't exist
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS record (" +
                    "id INT AUTO_INCREMENT PRIMARY KEY," +
                    "name VARCHAR(50) NOT NULL," +
                    "password VARCHAR(50) NOT NULL" +
                    ")");
        }
    }

    private static void registerUser(Scanner scanner) throws SQLException {
        System.out.print("Enter username: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        
        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             PreparedStatement pstmt = conn.prepareStatement("INSERT INTO record (name, password) VALUES (?, ?)")) {
            
            pstmt.setString(1, name);
            pstmt.setString(2, password);
            
            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Registration successful!");
            } else {
                System.out.println("Registration failed!");
            }
        }
    }

    private static void loginUser(Scanner scanner) throws SQLException {
        System.out.print("Enter username: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        
        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM record WHERE name = ? AND password = ?")) {
            
            pstmt.setString(1, name);
            pstmt.setString(2, password);
            
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                System.out.println("Login successful!");
            } else {
                System.out.println("Invalid username or password!");
            }
        }
    }
} 