import java.util.Scanner;
public class question3 {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter character");
     char a=sc.next().charAt(0);
     char lower=Character.toLowerCase(a);
     if(lower=='a'|| lower=='e' || lower=='i'|| lower=='o' || lower=='u'){
        System.out.println("It is vowel");
     }   
     else 
     System.out.println("It is consonant");
    }
}
