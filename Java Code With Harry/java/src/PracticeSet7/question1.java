import java.util.Scanner;
public class question1 {
    static void table(int a){
        for(int i=1;i<=10;i++){
          System.out.println(i+"*"+a+"="+(i*a));  
        }
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the table no ");
        int num=sc.nextInt();
        table(num);

    }
}