package TakingInput;

import java.util.Scanner;
public class TakingInput {
public static void main(String[] args) {
System.out.println("Taking input from The User");
Scanner kelash=new Scanner(System.in);
// System.out.print("Enter The first number");
// int a=kelash.nextInt();
// System.out.print("Enter the Second number");
// int b=kelash.nextInt();
// int sum=a+b;
// System.out.println("Sum is : "+ sum);


System.out.print("Enter a word: ");
        String str = kelash.next();
        System.out.println("You entered: " + str);

        // Consume the leftover newline character
        kelash.nextLine();

        // Taking input after whitespace (entire line)
        System.out.print("Enter a sentence: ");
        String str2 = kelash.nextLine();
        System.out.println("You entered: " + str2);

        kelash.close(); // Close the scanner to avoid resource leak
   }
   
}