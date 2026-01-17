import java.sql.*;

public class jdbc1{	
	public static void main(String args[]){
		String url=("jdbc:mysql://localhost:3306/students");
		String user="root";
		String password="Kelash2936";
	try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,user,password);
		Statement stmt=con.createStatement();
		ResultSet result=stmt.executeQuery("select * from student_info;");
		while(result.next()){
				System.out.println(result.getInt("id"));
				System.out.println(result.getString("name"));
				System.out.println(result.getInt("age"));
				System.out.println(result.getString("department"));
			
		} 
		stmt.close();
		con.close();
		result.close();
			  }
		catch(Exception e){
			e.printStackTrace();

					}

		

			}
		
	}