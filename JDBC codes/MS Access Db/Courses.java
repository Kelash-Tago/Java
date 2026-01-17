import java.sql.*;
public class Courses{
    public static void main(String args [])throws ClassNotFoundException{
	String databasePath="F:\\JDBC codes\\Database21.accdb";
	String url="jdbc:ucanaccess://"+databasePath;
        String query="Select course_name from courses";

	try{
	Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
	
	     }catch(ClassNotFoundException e){
		System.out.println(e.getMessage());

		}
      try{

	Connection con=DriverManager.getConnection(url);
	Statement stmt=con.createStatement();
	ResultSet rs=stmt.executeQuery(query);
	
	while(rs.next()){
	String name=rs.getString("CourSe_name");
	//int age=rs.getInt("Age");
	System.out.println("Course Name : "+name);
	//System.out.println("Age : "+age);
	System.out.println("__________________________");
	
	}
	stmt.close();
	con.close();

	} catch (SQLException s){
	System.out.println(s.getMessage());
	}
	
	}
	
}