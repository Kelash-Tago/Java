package PracticeSet1;
import java.util.Scanner;
public class question5 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        boolean b=sc.hasNextInt();
        System.out.println("It is integer number "+b);
        //Checks for floating points
        sc.nextLine();
        System.out.print("Enter the floating point number : ");
        boolean a=sc.hasNextDouble();
        System.out.println("It is double number "+a);
    }
    
}
