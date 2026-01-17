import java.util.Scanner;
public class EmployeeSalarySystem{
      public static void main(String args []){ 
	Scanner sc= new Scanner(System.in);

	System.out.print("Enter number of employees : ");
	int numberOfEmployees=sc.nextInt();
        sc.nextLine();

	Employee[] employee = new Employee[numberOfEmployees];

	for(int i=0;i<numberOfEmployees;i++){
	employee[i]=new Employee();
	System.out.println("Enter details of employee "+(i+1)+" : ");
	employee[i].inputEmployeeData();
	}

	employee[0].displayEmployeeData(employee);

	System.out.println("Average salary of the employees is : "+employee[0].calculateAverageSalary(employee));
     }

}

class Employee{
String name;
double salary;

Scanner sc= new Scanner(System.in);

void inputEmployeeData(){
System.out.print("Enter name of employee : ");
name=sc.nextLine();
System.out.print("Enter Salary of employee : ");
salary=sc.nextDouble();

}

void displayEmployeeData(Employee [] s){
for(int i=0;i<s.length;i++){ 
   System.out.print("Details of employee "+(i+1)+" : ");
	System.out.println("Name of employee : "+s[i].name);
	System.out.println("Salary of employee : "+s[i].salary);
   }
 }

double calculateAverageSalary(Employee [] e){
	double sum=0;
	for(int i=0;i<e.length;i++){
	sum+=e[i].salary;
      }
	double average=sum/e.length;
 return average;
}

}