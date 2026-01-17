package OOP;
class Employee{
    int id;
    String name;
    public void printDetails(){
        System.out.println("My id is "+id);
        System.out.println("My name is "+name);

    }
}
public class classes {
    public static void main(String[] args) {
        System.out.println("This is our custom class.");
        // Instantiation of new Employee object with name Kelash
        Employee Kelash=new Employee();
        Kelash.id=1;
        Kelash.name="Kelash Kumar";
        /*  System.out.println(Kelash.id);
         System.out.println(Kelash.name);*/
        //  can done with method eassily
        Kelash.printDetails();

        Employee Aneel=new Employee();
        Aneel.id=3;
        Aneel.name="Aneel Kumar";
        Aneel.printDetails();

    }
}
