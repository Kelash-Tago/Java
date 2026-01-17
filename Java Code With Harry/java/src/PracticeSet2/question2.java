package PracticeSet2;

import java.util.Scanner;

public class question2 {
    public static void main(String[] args) {
        
        char grade='a';
        int a=grade;
        System.out.println("Decrypted Grade "+(char)(a+8));//Decrypted Grade i
        
        char grade2='a';
        int num=grade;
        grade=(char)((int)grade+8);
        System.out.println("Decrypted grade "+grade);

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Character: ");
        char z=sc.next().charAt(0);
        z=(char)((int)z+8);
        System.out.println("The grade is : "+z);

       System.out.println("Enter 7 characters: ");
        char x=sc.next().charAt(7);
        System.out.println("Your string is "+x);//print 8th character
        
    }

    
}
