import java.sql.*;
public class MyConnectionClass{
	public static void main(String args[])throws ClassNotFoundException{
	
	String dbpath="F:\\JDBC codes\\Database21.accdb";
	String url="jdbc:ucanaccess://"+dbpath;
	
	  try{
	   Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
		System.out.println("Drivers loaded Successfully...");
	     }catch(ClassNotFoundException c){
		System.out.println(c.getMessage());
 	    
	}

	try{
	Connection con =DriverManager.getConnection(url);
	System.out.println("Conection established Successfully...");

	Statement stmt=con.createStatement();
	System.out.println("Statement created Successfully...");

	
           }catch(SQLException e){
	System.out.println(e.getMessage());
    }


 }
}