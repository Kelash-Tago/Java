import java.sql.*;
public class DbAccess{
   static Connection connection;
   static Statement stmt;

	static void initSetup(){
	
	Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
	String databasePath="F:\\JDBC codes\\Database21.accdb";
	String url="jdbc:ucanaccess://"+databasePath;
	connection=DriverManager.getConnection(url);
	stmt=connection.createStatement();

   }

static void showAllStudents()throws SQLException{
	ResultSet rs=stmt.executeQuery("Select name from students;");
	while(rs.next()){
	System.out.println(rs.getString("Name"));
    }

  }
public static void main(String args[])throws ClassNotFoundException{
	catch{
	initSetup();
}(ClassNotFoundException e){
System.out.println(e.getMessage());

}
	showAllStudents();
    }//end main method


}//main class end