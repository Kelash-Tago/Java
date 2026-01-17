import java.sql.*;

public class jdbc4{	
	public static void main(String args[]){
		String url=("jdbc:mysql://localhost:3306/students");
		String user="root";
		String password="2006";
	try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,user,password);
		Statement stmt=con.createStatement();
		int a=stmt.executeUpdate("delete from student_info where id=2");
		if( a>=1)
			System.out.println("record deleted  successfully.");
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
		