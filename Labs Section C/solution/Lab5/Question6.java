public class Question6 {

    public static void main(String[] args) {
        Employee employee1 = new Employee("Kelash", 06, 20000);
        Employee employee2 = new Employee("Aneel", 04, 20000);
        employee1.printDetails();
        employee2.printDetails();
    }
}

class Employee{
    String name;
    int experience;
    double salary;

    Employee(String name,int experience,double salary){
        this.name=name;
        this.experience=experience;
        this.salary=salary;
    }
    void printDetails(){
        System.out.println("Employee Name : "+name);
        if(experience>5){
            salary+=(salary*10/100);
        }
        System.out.println("Updated salary : "+salary);
    }
}