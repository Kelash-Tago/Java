import java.util.Scanner;
public class question9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter string ");
        String str = scanner.nextLine();
        String reversedStr=new StringBuilder(str).reverse().toString();
        System.out.println("Reversed String "+reversedStr);
        scanner.close();
    }
}
