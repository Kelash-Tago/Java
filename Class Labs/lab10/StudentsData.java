import java.sql.*;
import java.util.Scanner;

public class StudentsData {
    static Connection connection;
    static Statement stmt;
    static Scanner sc = new Scanner(System.in);

    static void initSetup() throws ClassNotFoundException, SQLException {
        Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        String databasePath = "F:\\Class Labs\\lab10\\StudentsData1.accdb";
        String url = "jdbc:ucanaccess://" + databasePath;
        connection = DriverManager.getConnection(url);
        stmt = connection.createStatement();
    }

    static void showAllStudents() throws SQLException {
        try (ResultSet rs = stmt.executeQuery("SELECT name, cms FROM students")) {
            System.out.println("___________________________________");
            while (rs.next()) {
                System.out.println("Name : " + rs.getString("Name"));
                System.out.println("CMS : " + rs.getString("CMS"));
                System.out.println("___________________________________");
            }
        }
    }

    static void addStudent() throws SQLException {
        System.out.print("Enter name of Student: ");
        String name = sc.nextLine();
        System.out.print("Enter CMS of Student: ");
        String cms = sc.nextLine();

        String query = "INSERT INTO students (name, cms) VALUES (?, ?)";
        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
            pstmt.setString(1, name);
            pstmt.setString(2, cms);
            pstmt.executeUpdate();
        }
    }

    static void deleteRecord() throws SQLException {
        System.out.print("Enter CMS ID of Student: ");
        String cms = sc.nextLine();
        
        String query = "DELETE FROM students WHERE cms = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
            pstmt.setString(1, cms);
            pstmt.executeUpdate();
        }
    }

    public static void main(String[] args) throws Exception {
        initSetup();
        boolean iterateLoop = true;

        while (iterateLoop) {
            System.out.println("\n1. Show Students");
            System.out.println("2. Add Student record");
            System.out.println("3. Remove Student record");
            System.out.println("4. Update Student record");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    showAllStudents();
                    break;
                case 2:
                    addStudent();
                    break;
                case 3:
                    deleteRecord();
                    break;
                case 4:
                    System.out.println("Update functionality not implemented yet");
                    break;
                case 5:
                    iterateLoop = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        stmt.close();
        connection.close();
        sc.close();
    }
}