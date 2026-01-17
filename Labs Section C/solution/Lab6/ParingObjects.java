public class ParingObjects {

    public static void main(String[] args) {
        Student std1=new Student("Kelash",19);
        Student std2 = new Student(std1);
        std1.printDetails();
        std2.printDetails();
    }
}
class Student{
    String name;
    int age;
    Student( String name,int age){
        this.name=name;
        this.age=age;

    }
    Student(Student s){
        this.name=s.name;
        this.age=s.age;
    }
    void printDetails(){
        System.out.println("Name :"+name);
        System.out.println("Age : "+age);
    }
}