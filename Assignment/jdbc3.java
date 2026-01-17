import java.sql.*;

public class jdbc3{	
	public static void main(String args[]){
		String url=("jdbc:mysql://localhost:3306/students");
		String user="root";
		String password="Kelash2936";
	try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,user,password);
		Statement stmt=con.createStatement();
		int a=stmt.executeUpdate("insert into student_info(id,name,age,department) values(7,'kashif Ali',19,'camputer sens');");
		if( a>=1)
			System.out.println("record inserted  successfully.");
		else
			System.out.println("record not found");
		stmt.close();
		con.close();
		
			  }
		catch(Exception e){
			e.printStackTrace();

					}

		

			}
		
	} 