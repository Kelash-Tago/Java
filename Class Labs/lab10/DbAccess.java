import java.sql.*;
import java.util.Scanner;
public class DbAccess{
   static Connection connection;
   static Statement stmt;
static Scanner sc=new Scanner(System.in);


    static void initSetup()throws Exception{
	Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
	String databasePath="F:\\Class Labs\\lab10\\StudentsData1.accdb";
	String url="jdbc:ucanaccess://"+databasePath;
	connection=DriverManager.getConnection(url);
	stmt=connection.createStatement();
   }


static void showAllStudents()throws Exception{
	initSetup();
	ResultSet rs=stmt.executeQuery("Select name,cms from students;");
	System.out.println("___________________________________");

	while(rs.next()){
	System.out.println("Name : "+rs.getString("Name"));
	System.out.println("CMS : "+rs.getString("CMS"));
	System.out.println("___________________________________");
	
         }
	//stmt.close();
	//connection.close();
    }

static void addStudent() throws SQLException {
        System.out.print("Enter name of Student: ");
        String name = sc.nextLine();
        System.out.print("Enter CMS of Student: ");
        String cms = sc.nextLine();

        String query = "insert into students (name, cms) VALUES (?, ?)";
        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
            pstmt.setString(1, name);
            pstmt.setString(2, cms);
            pstmt.executeUpdate();
        }
    }



 static void deleteRecord() throws SQLException {
        System.out.print("Enter CMS ID of Student: ");
        String cms = sc.nextLine();
        
        String query = "DELETE FROM students WHERE cms = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
            pstmt.setString(1, cms);
            pstmt.executeUpdate();
        }
    }



  

/*static boolean checkCMS(String myId)throws Exception{
boolean b=false;
//initSetup();
String query="Select cms from students where cms="+myId+" ;";
ResultSet rs=stmt.executeQuery(query);
int count=0;
while(rs.next()){
count++;
}
//stmt.close();
//connection.close();
if(count>0)
b=true;
return b;
}
*/


public static void main(String args[])throws Exception{
	
	initSetup();
	boolean iterateLoop=true;

	while(iterateLoop){
	System.out.println("1.Show Students");
	System.out.println("2.Add Student record");
	System.out.println("3.Remove Student record");
	System.out.println("4.Update Student record ");
	System.out.println("5.Exit");
	System.out.print("Enter your choice: ");
	int choice=sc.nextInt();
	sc.nextLine();

	switch(choice){
	case 1:
	showAllStudents();
	break;

	 case 2:
           addStudent();
           break;
         case 3:
         deleteRecord();
         break;	
	case 4:
	
	break;
	
	case 5:
	iterateLoop=false;
	break;
	default :
	System.out.println("You entered wrong choice.");


          }//end switch case 
     }//while loop


stmt.close();
connection.close();

    }//end main method


}//main class end