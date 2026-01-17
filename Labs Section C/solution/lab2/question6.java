import java.util.Scanner;
public class question6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number : ");
        int  number= scanner.nextInt();
        int sum=0;
        int odd=0;
        int even=0;
        while(number>0){
            sum=sum+(number%10);
            if((number%10)%2==0)
            even++;
            else 
            odd++;
            number=number/10;

        }
        System.out.println("Sum of digits in number : "+sum);
        System.out.println("Number of odd digits in number "+odd);
        System.out.println("Number of even digits in number "+even);

        scanner.close();
    }
}
