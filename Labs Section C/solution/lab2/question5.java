import java.util.Scanner;

public class question5 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Satring point :");
        int startingPoint=sc.nextInt();
        System.out.print("Enter Ending point :");
        int endingPoint=sc.nextInt();
        int firstTerm=0;
        int secondTerm=1;
        while (true) {
            if(firstTerm>=endingPoint)
            break;
            if(firstTerm>=startingPoint){
            System.out.print(firstTerm+" ");
            }
            int temp=secondTerm;
            secondTerm=firstTerm+secondTerm;
            firstTerm=temp;
            
            
        }
    }

}

