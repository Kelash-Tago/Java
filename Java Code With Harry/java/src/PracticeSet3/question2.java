import java.util.Scanner;
public class question2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enetr the string");
        String str=sc.nextLine();
        System.out.println(str.replace(" ","_"));
    }
}