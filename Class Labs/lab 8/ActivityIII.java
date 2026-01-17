import java.util.Scanner;
public class ActivityIII{
    public static void main(String args []){
	Scanner sc= new Scanner(System.in);
	System.out.print("Enter number of students : ");
	int numberOfStudents=sc.nextInt();
	sc.nextLine();	

	student[] std = new student[numberOfStudents];
	for(int i=0;i<numberOfStudents;i++){
	System.out.println("Enter details of student"+(i+1));
	System.out.print("Enter name of student : ");
	String name=sc.nextLine();
	
	System.out.print("Enter CMS ID : ");
	String cms_id=sc.nextLine();
	
	System.out.print("Enter Number of Contacts : ");
	int numberOfContacts=sc.nextInt();
	int[] contact=new int[numberOfContacts];
	
	for(int j=0;j<numberOfContacts;j++){
	System.out.print("Enter contact no "+(j+1)+" : ");
	contact[j]=sc.nextInt();
	
		}
	sc.nextLine();
	std[i]=new student();
	std[i].setName(name);
	std[i].setCmsId(cms_id);
	std[i].setContact(contact,numberOfContacts);

	
	}
	
	
for(int i=0;i<numberOfStudents;i++){
	std[i].printDetails();
}
	
	
    }
}
class student{
String name;
String cms_id;
int contact[];

void setName(String name){
this.name=name;
}

void setCmsId(String cms_id){
this.cms_id=cms_id;
} 

void setContact(int contact[],int num){
this.contact=new int[num];
for(int i=0;i<num;i++){
this.contact[i]=contact[i];
   
  }
}

String getName(){
return name;
}

String getCmsId(){
return cms_id;
}

int getContacts(){
return contact.length;
}

void printDetails(){
	System.out.println("Name of Student : "+name);
	System.out.println("CMS ID of Student : "+cms_id);
	System.out.print("Numbers of Student : ");
	for(int i=0;i<contact.length;i++){
		System.out.print(contact[i]+" , ");
		}

	}

}