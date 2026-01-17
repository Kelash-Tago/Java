import java.sql.*;

public class jdbc2{	
	public static void main(String args[]){
		String url=("jdbc:mysql://localhost:3306/students");
		String user="root";
		String password="2006";
	try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,user,password);
		Statement stmt=con.createStatement();
		int a=stmt.executeUpdate("update student_info set name='Abdul Wahid' where id=1");
		if( a>=1)
			System.out.println("record updated successfully.");
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
		