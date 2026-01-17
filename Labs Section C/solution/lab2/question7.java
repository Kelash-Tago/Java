import java.util.Scanner;
public class question7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter starting point :");
        int startingPoint = scanner.nextInt();
        System.out.print("Enter ending point :");
        int endingPoint = scanner.nextInt();
        for (int i = 2; i <=endingPoint ; i++) {
                boolean check=true;
            for (int j = 2; j <i/2; j++) {
                if(i%j==0){
                check=false;
                
            }
            }
            
            if(check && i>=startingPoint && i<=endingPoint)
            System.out.print(i+" ");
        }
        scanner.close();
    }
}
