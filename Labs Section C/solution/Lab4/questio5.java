
class Student{
    String name;
    int age;
    int rollNo;
    Student(String name,int age,int rollNo){
        this.name=name;
        this.age=age;
        this.rollNo=rollNo;
    }
    void displayInfo(){
        System.out.println("Student Name : "+name);
        System.out.println("age : "+age);
        System.out.println("RollNumber : "+rollNo);
        System.out.println("______________________________________");
    }
}
public class questio5 {
    public static void main(String[] args) {
        Student std1=new Student("Kelash",19,1);
        Student std2=new Student("Aneel Kumar",20,2);
        Student std3=new Student("Totaram",18,3);
        std1.displayInfo();
        std2.displayInfo();
        std3.displayInfo();



        
    }
}
