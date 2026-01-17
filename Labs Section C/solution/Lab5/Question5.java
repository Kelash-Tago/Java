public class Question5 {
    public static void main(String[] args) {
        BankAccount obj =new BankAccount(123, "Kelash", 01000.0);
        obj.printDetails();
    }
}
class BankAccount{
    int accountNum;
    String accountHolder;
    double balance;
    BankAccount(int accountNum,String accountHolder,double balance){
        this.accountNum=accountNum;
        this.accountHolder=accountHolder;
        this.balance=balance;
    }
    void printDetails(){
        System.out.println("Account Number : "+accountNum);
        System.out.println("Account Holder : "+accountHolder);
        System.out.println("Balance : "+balance);

    }
}