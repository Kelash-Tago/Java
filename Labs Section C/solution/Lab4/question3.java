import java.util.Random;
import java.util.Scanner;
public class question3 {
    public static void main(String[] args) {
        
    
    // Random random=new Random();
    Scanner sc=new Scanner(System.in);
    int score=0;
    while(true){
        System.out.print("Do you want to play if yes then y or n for no:");
        char question=sc.next().charAt(0);
        if(Character.toLowerCase(question)=='y'){
            // int randomNumber=random.nextInt(6)+1;
            int randomNumber = (int)(Math.random() * 7);
            System.out.println("You rollled "+randomNumber);
            score=score+randomNumber;
        }
        else if(Character.toLowerCase(question)=='n'){
            System.out.println("Your Score :"+score);
            break;
        }
    }
  }
}
