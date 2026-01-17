package TakingInput;
import java.util.Scanner;

public class PracticeQuestion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the marks of subject1 : ");
        int subject1=sc.nextInt();
        System.out.print("Enter the marks of subject2 : ");
        int subject2=sc.nextInt();
        System.out.print("Enter the marks of subject3 : ");
        int subject3=sc.nextInt();
        System.out.print("Enter the marks of subject4 : ");
        int subject4=sc.nextInt();
        System.out.print("Enter the marks of subject5 : ");
        int subject5=sc.nextInt();

        double percentage=(((double)subject1+subject2+subject3+subject4+subject5)/500)*100;
        System.out.println("The percentage is : "+ percentage);
        
    }
    
}
