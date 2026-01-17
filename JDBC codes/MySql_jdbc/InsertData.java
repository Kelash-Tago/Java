import java.sql.*;
import java.util.Scanner;
public class InsertData{
public static void main(String args [])throws ClassNotFoundException{
	
	Scanner scanner = new Scanner(System.in);
	String url="jdbc:mysql://localhost:3306/school";
	String username="root";
	String password="Kelash2936";
	
   try{
	Class.forName("com.mysql.cj.jdbc.Driver");
	System.out.println("Drivers loaded successfuully");
	} catch(ClassNotFoundException e){
 	System.out.println(e.getMessage());
	}

	try{
	Connection con = DriverManager.getConnection(url,username,password);
	System.out.println("Connection established successfuully");
	String query="INSERT INTO students (student_id, student_name, email, age, course_id) VALUES (?,?,?,?,?);";

	System.out.print("Enter student id: ");
        int student_id = scanner.nextInt();
	scanner.nextLine();

	System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter student email: ");
        String email = scanner.nextLine();
        
        System.out.print("Enter student age: ");
        int age = scanner.nextInt();
	scanner.nextLine();

	System.out.print("Enter course_id: ");
        int course_id = scanner.nextInt();
	scanner.nextLine();

	
	PreparedStatement pstmt = con.prepareStatement(query);
	pstmt.setInt(1,student_id);
	pstmt.setString(2,name);
        pstmt.setString(3,email);
	pstmt.setInt(4,age);
	pstmt.setInt(5,course_id);		
	


	//Statement stmt=con.createStatement();
	int rowsAffected=pstmt.executeUpdate();
	
	if(rowsAffected>0){
	System.out.println(rowsAffected+" rows affected..");

	}else
	System.out.println(rowsAffected+" rows affected failed to insert");
	



		pstmt.close();
	con.close();
	System.out.println();
	System.out.println("Connection Closed Successfully..");
	

	} catch(SQLException s){
	System.out.println(s.getMessage());
	}
   }
}