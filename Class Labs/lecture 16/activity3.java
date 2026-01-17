import java.util.Scanner;

class Student {
    String name;
    String cmsId;
    String[] contacts;
    Scanner scan = new Scanner(System.in);
    
    Student() {
        System.out.print("Enter your name: ");
        setName(name);
        System.out.print("Enter your CMS ID: ");
        setCMSID(cmsId);
        System.out.print("Enter the number of contacts: ");
        int a = scan.nextInt();
        scan.nextLine();
        contacts = new String[a];
        setContact(contacts);
    }

    void setName(String name) {
        this.name = scan.nextLine();
    }

    void setCMSID(String cmsId) {
        this.cmsId = scan.nextLine();
    }

    void setContact(String array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter contact " + (int)(i + 1) + " : ");
            array[i] = scan.next();
        }
    }

    String Name() {
        return name;
    }

    String CMS() {
        return cmsId;
    }

    String[] Contacts() {
        return contacts;
    }
}

public class activity3 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of Students: ");
        int z = scan.nextInt();
        scan.nextLine(); 

        Student[] students = new Student[z];  // Fixed: using z instead of numStudents

        for (int i = 0; i < z; i++) {
            students[i] = new Student();  // The constructor already handles all input
        }

        
        for (int i = 0; i < z; i++) {
            System.out.println("Student name: " + students[i].Name());
            String[] contacts = students[i].Contacts();
            for (String contact : contacts) {
                System.out.println(contact);
            }
        }
        
        scan.close();
    }
}
