class Student {
	String name;
	String cmsId;
	String[] contacts;
	
	Student(String name,String cmsId,String[] contacts){
	this.name=name;
	this.cmsId=cmsId;
	this.contacts=contacts;
	
	}

void printDetails(){
	System.out.println("Name of student : "+name);
	System.out.println("CMSid of student : "+cmsId);
	System.out.println("contact numbers  of student : ");
	for(int i=0;i<contacts.length;i++){
	System.out.print(contacts[i]+"  ");
	
	}

	
	}

  }

public class activity2{
   public static void main(String args[]){
	String name="abc";
	String cmsId="0-0";
	String[] contacts={"000-1234567","000-1234568"};
	Student std1 = new Student(name,cmsId,contacts);
	std1.printDetails();

	}
 }