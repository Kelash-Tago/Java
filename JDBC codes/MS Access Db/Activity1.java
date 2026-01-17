import java.sql.*;
public class Activity1{
    public static void main(String args[]) throws Exception{
    //step 1: load ucanaccess driver
    Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
    //step 2: prepare data for establishing connection with database
    String dbName = "F:\\JDBC codes\\Database21.accdb";
    String dbUrl = "jdbc:ucanaccess://" + dbName;
    //step 3: create Connection object using prepared connection data
    Connection con = DriverManager.getConnection(dbUrl);
    //step 4: prepare a query and statement object to execute the query
    String query = "Select name from Student;";
    Statement stmt = con.createStatement();
    //step 5: execute a query, using executeQuery() or executeUpdate() methods
    ResultSet resourceHandle = stmt.executeQuery(query);
    while(resourceHandle.next()) {
    System.out.println(resourceHandle.getString("Name"));
   
    System.out.println("---");
    }
    //step 6: release the occupied resources
    resourceHandle.close();
    stmt.close();
    con.close();
    }//end main
}//end class