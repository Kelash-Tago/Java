import java.util.Scanner;
public class EmployeeManagement{
   public static void main(String args[]){
   Scanner sc= new Scanner(System.in);
	
System.out.print("Enter number of employees : " );
int numberOfEmployees=sc.nextInt();
sc.nextLine();
Employee[] employees=new Employee[numberOfEmployees];

for(int i=0;i<numberOfEmployees;i++){ 
  System.out.println("Enter details for student "+(i+1));
  System.out.print("Enter name of student : ");
  String name=sc.nextLine();
System.out.print("Enter Employee Id of student : ");
  String employeeId=sc.nextLine();
System.out.print("Enter number of Skills of student : ");
int numberOfSkills=sc.nextInt();
sc.nextLine();
String arr[]=new String[numberOfSkills];
for(int j=0;j<numberOfSkills;j++){
   System.out.print("Enter skill "+(j+1)+ " : ");
  arr[j]=sc.nextLine();
  }

 employees[i]=new Employee();
 employees[i].setName(name);
 employees[i].setEmployeeId(employeeId);
employees[i].setSkills(arr,numberOfSkills);



  }


         for(int i=0;i<numberOfEmployees;i++){
	System.out.println("Details of student "+(i+1));
	 System.out.println("Name of student : "+employees[i].getName());
	 System.out.println("EmployeeID of student : "+employees[i].getEmployeeId());
	String [] myArr=employees[i].getNumberOfSkills();
	System.out.println("Skills ");

	for(int j=0;j<myArr.length;j++){ 
	System.out.print(myArr[j]+" ");
	}
	System.out.println("");

       }
    
   }
}

class Employee{
String name;
String employeeId;
String [] numberOfSkills;

void setName(String name){
this.name=name;
}

void setEmployeeId(String employeeId){
this.employeeId=employeeId;
}

void setSkills(String arr[],int num){
   numberOfSkills=new String[num];
for(int i=0;i<arr.length;i++){
 numberOfSkills[i]=arr[i];
  }
}

 String getName(){ 
return name;
   }

 String getEmployeeId(){ 
return employeeId;
   }
String[] getNumberOfSkills(){
return numberOfSkills;
}

 }