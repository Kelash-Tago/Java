import java.util.Scanner;
public class question1 {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int target=41;
        while(true){
            
            System.out.print("Enter Number : ");
            int number=sc.nextInt();
            if(number==target){
                System.out.println("Successfully guessed...");
                break;
            }

            if(number>70)
                System.out.println("too far");
            else if(number>50 && number<70)
                System.out.println("close");
            else if(number>30 && number <50){
                System.out.println("close");
            }
            else if(number<30)
            System.out.println("too far");
            

        }
    }
}