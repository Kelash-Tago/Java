public class Question5 {
    public static void main(String[] args) {
        Student student1 = new Student("Kelash", 'A');
        Student student2 = new Student("Kalesh", 'B');

        if (student2.compareGrade(student1))
            System.out.println(student2.name + " has a greater grade than " + student1.name);
        else 
            System.out.println(student1.name + " has a greater grade than " + student2.name);
    }
}

class Student {
    String name;
    char grade;

    // Constructor
    Student(String name, char grade) {
        this.name = name;
        this.grade = grade;
    }

    // Corrected method: Higher grade = Lower ASCII value
    boolean compareGrade(Student p) {
        return this.grade > p.grade; // ✅ Now correctly returns true if student2 has a HIGHER grade
    }
}
