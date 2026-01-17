import java.util.Scanner;
public class ContactManagementSystem{
      public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter number of contact : ");
        int contacts=sc.nextInt();
	sc.nextLine();
        ContactInformation obj = new ContactInformation(contacts);
	
	obj.inputContacts(sc);
	
	obj.displayAllContacts();
	
	
       
     }
 }

class ContactInformation{
     String name[];
     String phoneNumber[];
     String email[];

   ContactInformation(int num){
   name=new String[num];
   phoneNumber = new String[num];
   email = new String[num];
   }

void inputContacts(Scanner sc){
     for(int i=0;i<name.length;i++){
	System.out.println("Enter details of person "+(i+1)+" : ");

	System.out.print("Enter name : ");
	name[i]=sc.nextLine();
	System.out.print("Enter phone number : ");
	phoneNumber[i]=sc.nextLine();
	System.out.print("Enter email : ");
	email[i]=sc.nextLine();
	
      }      
   }

void displayAllContacts(){
 for(int i=0;i<name.length;i++){
	System.out.println("Details of person "+(i+1)+" : ");

	System.out.println("name : "+name[i]);
	System.out.println("Phone number : "+phoneNumber[i]);
	System.out.println("Email : "+email[i]);
	
      }      


}
 
}