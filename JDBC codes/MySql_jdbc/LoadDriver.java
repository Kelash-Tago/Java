import java.sql.*;
public class LoadDriver{
public static void main(String args [])throws ClassNotFoundException{

	String url="jdbc:mysql://localhost:3306/hr";
	String username="root";
	String password="Kelash2936";
   try{
	Class.forName("com.mysql.cj.jdbc.Driver");
	System.out.println("Drivers loaded successfully");
	} catch(ClassNotFoundException e){
 	System.out.println(e.getMessage());
	}

	try{
	Connection con = DriverManager.getConnection(url,username,password);
	System.out.println("Connection established successfully");
	
	Statement stmt=con.createStatement();

	ResultSet rs = stmt.executeQuery("Select employee_id,first_name,salary  from employees limit 5;");

	while(rs.next()){
	int employee_id=rs.getInt("employee_id");
	String first_name=rs.getString("first_name");
	int salary=rs.getInt("salary");
	
	System.out.println("First Name : "+first_name);
	System.out.println("Employee ID : "+employee_id);
	System.out.println("Salary : "+salary);
	System.out.println("____________________________________");
	}

	stmt.close();
	con.close();
	System.out.println();
	System.out.println("Connection Closed Successfully..");
	

	} catch(SQLException s){
	System.out.println(s.getMessage());
	}
   }
}