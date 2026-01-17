import java.time.Year;
import java.util.Scanner;
public class question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int currentYear=Year.now().getValue();
        System.out.println("Enter birth year : ");
        int birthYear=sc.nextInt();
        System.out.println("Your age is "+(currentYear-birthYear));

    }
}
