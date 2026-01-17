import java.sql.*;
public class DeleteData{
public static void main(String args [])throws ClassNotFoundException{

	String url="jdbc:mysql://localhost:3306/school";
	String username="root";
	String password="Kelash2936";
	String query="DELETE FROM students WHERE student_id = 1;";
   try{
	Class.forName("com.mysql.cj.jdbc.Driver");
	System.out.println("Drivers loaded successfuully");
	} catch(ClassNotFoundException e){
 	System.out.println(e.getMessage());
	}

	try{
	Connection con = DriverManager.getConnection(url,username,password);
	System.out.println("Connection established successfuully");
	
	Statement stmt=con.createStatement();
	int rowsAffected=stmt.executeUpdate(query);
	
	if(rowsAffected>0){
	System.out.println(rowsAffected+" rows deleted..");

	}else
	System.out.println(rowsAffected+" rows affected failed to  delete");
	



		stmt.close();
	con.close();
	System.out.println();
	System.out.println("Connection Closed Successfully..");
	

	} catch(SQLException s){
	System.out.println(s.getMessage());
	}
   }
}