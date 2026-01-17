import java.util.Scanner;
public class question10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string : ");
        String str=sc.next();
        String reversedStr=new StringBuilder(str).reverse().toString();
        if(reversedStr.equals(str)){
            System.out.println("Palindrome");

        }
        else
        System.out.println("Not Palindrome");
    }
}
