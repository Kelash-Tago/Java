public class Question8 {
    public static void main(String[] args) {
        Customer customer = new Customer("Kelash",20,9000);
        LoanAccount loan = new LoanAccount(customer);
    }

}

class Customer{
    String name;
    int age;
    double accountBalance;
    Customer(String name,int age,double accountBalance){
        this.name=name;
        this.age=age;
        this.accountBalance=accountBalance;
    }
    
}

class LoanAccount{
    LoanAccount(Customer c){
        System.out.println("Name : " + c.name);
        System.out.println("Age : " + c.age);
        System.out.println("Account Balance : " + c.accountBalance);
        if(c.accountBalance<10000){
            System.out.println("Not eigible for loan");
        }
        else 
        System.out.println("Eligible for loan.");
    }
}