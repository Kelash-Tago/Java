import java.util.Scanner;
class BankAccount{
    int accountNum;
    String accountHolder;
    double balance;
    Scanner sc=new Scanner(System.in);
    BankAccount(){
        System.out.print("Enter Account Number : ");
        accountNum=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Account Holder Name : ");
        accountHolder=sc.nextLine();
        System.out.print("Enter Account balance : ");
        balance=sc.nextDouble();
        System.out.println("Account created successfully..");
    }
    void depositMoney(){
        System.out.print("Enter money to deposit : ");
        double depositingAmount=sc.nextDouble();
        balance+=depositingAmount;
        System.out.println("Amount deposited successfully...");
    }
    void withdrawMoney(){
        System.out.print("Enter money to withdraw : ");
        double withdrawAmount=sc.nextDouble();
        balance-=withdrawAmount;
        System.out.println("Amount withdrawl successfully...");
    }
    void printAccountDetails(){
        System.out.println("Account Number : "+accountNum);
        System.out.println("Account Holder : "+accountHolder);
        System.out.println("Balance : "+balance);


    }
    void mainMenu(){
        System.out.println("1.Print Account Details.\n2.Deposit Money.\n3.Withdraw Money.\n4.exit");
    }
}
public class Question10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BankAccount account1=new BankAccount();

        while(true){
            account1.mainMenu();
            System.out.print("Enter 1 to 4");
            int num=sc.nextInt();
            switch(num){
                case 1:
                account1.printAccountDetails();
                break;
                case 2:
                account1.depositMoney();
                break;
                case 3:
                account1.withdrawMoney();
                break;
                case 4:
                System.exit(0);
                default:
                System.out.println("Please enter between 1 and 4 ");

            }

        }
       
       
    }
}
