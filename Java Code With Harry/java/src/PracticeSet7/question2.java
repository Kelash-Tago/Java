import java.util.Scanner;

public class question2 {
    static void print(int a) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a; i++) {
            for (int j = 0; j <= i; j++) {
                sb.append("* ");
            }
            sb.append("\n");
        }
        System.out.print(sb.toString()); // Print the entire pattern at once
    }

       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        sc.close();  // Close scanner to prevent memory leak
        print(num);
    }
}
