public class Question3 {
    public static void main(String[] args) {
        Employee employee = new Employee(50000);
        System.out.println("Salary before method call "+employee.salary);
        employee.increaseSalary(3000);
        System.out.println("Salary after method call "+employee.salary);


        
    }
}

class Employee{
    double salary;
    Employee(double salary){
        this.salary=salary;
    }

    void increaseSalary(int increment){
        salary=salary+increment;
        System.out.println("Method called Salary after increment "+salary);
    }
}
