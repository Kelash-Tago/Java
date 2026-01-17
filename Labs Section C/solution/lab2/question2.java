import java.util.Scanner;
public class question2 {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter three numbers");
    float a=sc.nextFloat();
    float b=sc.nextFloat();
    float c=sc.nextFloat();
    System.out.println("greatest number is "+Math.max(Math.max(a, b),c));


}
    
}