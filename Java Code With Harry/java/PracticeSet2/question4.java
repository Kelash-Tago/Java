package PracticeSet2;
import java.util.Scanner;
public class question4 {
    public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter V: ");
    int v=sc.nextInt();
    System.out.println("Enter U: ");
    int u=sc.nextInt();
    System.out.println("Enter a: ");
    int a=sc.nextInt();
    System.out.println("Enter s: ");
    int s=sc.nextInt();
    double result=(double)((v*v)-(u*u))/(2*a*s);
    System.out.println("Result="+result);

sc.close();
    }

    
}
