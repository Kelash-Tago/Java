import java.util.Scanner;
public class question13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter sentence :");
        String sentence=sc.nextLine();
        System.out.print("Enter word to remove from string : ");
        String word=sc.next();
        System.out.println("Enter replacing word");
        String replacingWord=sc.next();
        System.out.println("Modified string : "+sentence.replace(word, replacingWord));

    }
}
