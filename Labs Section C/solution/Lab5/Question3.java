public class Question3 {
    public static void main(String[] args) {
        Student std1 = new Student("Kelash","A+");
        std1.printDetails();
        
    }
}
class Student{
    String name;
    String grade;
    Student(String name,String grade){
        this.name=name;
        this.grade=grade;

    }

    void printDetails(){
        System.out.println("Name : "+name);
        System.out.println("Grade : "+grade);
    }
}
