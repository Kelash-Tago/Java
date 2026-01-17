import java.util.Scanner;
class employeeInfo{
     private int salary;
    private int workHours;
    void getInfo(int salary,int workHours){
        this.salary=salary;
        this.workHours=workHours;
    }
    void addWork(){
        if(workHours>8)
        salary+=5;
    }
    void printSalary(){
        System.out.println("Salary of the employee is : "+salary);

    }
}
public class question4 {
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        employeeInfo employee=new employeeInfo();
        employee.getInfo(25000, 9);
        employee.addWork();
        employee.printSalary();

        

    }
}
