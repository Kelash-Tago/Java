import java.sql.*;
import java.util.Scanner;
public class Activity2{
   static Connection connection;
   static Statement stmt;
   static PreparedStatement pstmt;
static Scanner sc=new Scanner(System.in);


	//Method for loading driver getting connection and creating statement	
    static void initSetup()throws Exception{
	Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
	String databasePath="F:\\Class Labs\\lab10\\StudentsData1.accdb";
	String url="jdbc:ucanaccess://"+databasePath;
	connection=DriverManager.getConnection(url);
	stmt=connection.createStatement();
   }


	// for diplaying students data
    static void showAllStudents()throws Exception{
	initSetup();
	ResultSet rs=stmt.executeQuery("Select name,cms from students;");
	System.out.println("___________________________________");

	while(rs.next()){
	System.out.println("Name : "+rs.getString("Name"));
	System.out.println("CMS : "+rs.getString("CMS"));
	System.out.println("___________________________________");
	
         }

     }


	// adding new student record
static void addStudent()throws Exception{
	System.out.print("Enter Name of Student : ");
	String name=sc.nextLine();

	System.out.print("Enter cms id : ");
	String cms_id=sc.nextLine();

	String query = "INSERT INTO students (CMS, Name) VALUES (?,?)";
	pstmt = connection.prepareStatement(query);

	pstmt.setString(1,cms_id);
	pstmt.setString(2,name);
	
	int affectedRows=pstmt.executeUpdate();
	if(affectedRows>0)
	System.out.println("Successfully inserted");

	pstmt.close();
	
  }


static void deletStudent()throws Exception{
	System.out.print("Enter cms id : ");
	String cms_id=sc.nextLine();
	String query="Delete from students where cms=? ;";
	pstmt = connection.prepareStatement(query);
	pstmt.setString(1,cms_id);
	int affectedRows=pstmt.executeUpdate();
 	if(affectedRows>0)
	System.out.println("Successfully deleted");
	pstmt.close();

}


static void updateStudent()throws Exception{
	System.out.println("1.Update name");
	System.out.println("2.Update CMS");
	System.out.print("Enter choice : ");
	int choice=sc.nextInt();
	sc.nextLine();   //used this to remove buffer input i have taken int as input before

	if(choice ==1){

	System.out.print("Enter cms of student : ");
	String cms=sc.nextLine();
	System.out.print("Enter new name  of student : ");
	String name=sc.nextLine();
	String query="update students set Name=? where CMS =? ";
	pstmt=connection.prepareStatement(query);
	pstmt.setString(1,name);
	pstmt.setString(2,cms);

	int affectedRows=pstmt.executeUpdate();
           if(affectedRows>0)
        System.out.println("Successfully updated");
	
	 pstmt.close();
	}



	else if(choice==2){

	System.out.print("Enter cms of student : ");
	String cms=sc.nextLine();
	System.out.print("Enter new cms  of student : ");
	String newCms=sc.nextLine();
	String query="update students set CMS=? where CMS =? ";
	
	pstmt=connection.prepareStatement(query);
	pstmt.setString(1,newCms);
	pstmt.setString(2,cms);

	
	int affectedRows=pstmt.executeUpdate();
           if(affectedRows>0)
        System.out.println("Successfully updated");
	
	pstmt.close();

       }else
	System.out.print("You entered wrong choice can not be updated...");
}//end update student method



 
static void searchStudent()throws Exception{
 	System.out.println("1.Search by name");
	System.out.println("2.Search by CMS");
	System.out.print("Enter choice : ");
	int choice=sc.nextInt();
	sc.nextLine();
	if(choice ==1){
	System.out.print("Enter name : ");
	String name=sc.nextLine();
	String query="Select name,cms from students;";
	ResultSet rs =stmt.executeQuery(query);

	boolean notFound=true;  // for checking if student not found 

	while(rs.next()){
	if(name.equals(rs.getString("Name"))){
	   System.out.println("========Student found in record======= ");

		notFound=false;   // because student found

		System.out.println("___________________________________");

		System.out.println("Name : "+rs.getString("Name")+"    CMS : "+rs.getString("CMS"));

		}
	

		}//close while loop which checks name 

		
		if(notFound) { // check if student not found
			System.out.println("___________________________________");
			System.out.println("Student is not in record..");}//closing nested if 

	}//if block which check name 
	

	else if(choice ==2){
	System.out.print("Enter CMS : ");
	String cms=sc.nextLine();
	String query="Select name,cms from students;";
	ResultSet rs =stmt.executeQuery(query);
	boolean notFound=true;
	while(rs.next()){
	   if(cms.equals(rs.getString("CMS"))){
	   	System.out.println("========Student found in record======= ");
	
	   	notFound=false;

		System.out.println("___________________________________");

		System.out.println("Name : "+rs.getString("Name")+"    CMS : "+rs.getString("CMS"));

		}

		}//closing while loop
		 
			if(notFound) { // check if student not found
			System.out.println("___________________________________");
			System.out.println("Student is not in record..");}//closing nested if 
		
		}//end if else  block of choice 2

     	else  // main if else block choice
    	 System.out.println("You entered wrong choice. ");


	
  }//end search student method
  




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
	System.out.println("___________________________________");

	System.out.println("1.Search Student");
	System.out.println("2.Show Students");
	System.out.println("3.Add Student record");
	System.out.println("4.Remove Student record");
	System.out.println("5.Update Student record ");
	System.out.println("6.Exit");
	System.out.println("___________________________________");

	System.out.print("Enter your choice: ");
	int choice=sc.nextInt();
	sc.nextLine();
	System.out.println("___________________________________");


	switch(choice){
	case 1:
	searchStudent();
	break;

	case 2:
	showAllStudents();
	break;

	case 3:
        addStudent();
        break;

        case 4:
        deletStudent();
        break;
	
	case 5:
	updateStudent();
	break;
	
	case 6:
	iterateLoop=false;
	break;

	default :
	System.out.println("You entered wrong choice...");


          }//end switch case 
     }//while loop


stmt.close();
connection.close();

    }//end main method


}//main class end