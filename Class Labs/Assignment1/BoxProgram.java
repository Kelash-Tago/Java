import java.util.Scanner;
class Box{
    double width;
    double height;
    double length;
     

    Box(double a,double b,double c){
        height=a;
        width=b;
        length=c;
    }

}

public class BoxProgram {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.print("Enter the number of objects you want : ");
        int num=sc.nextInt();
        for(int i=1;i<=num;i++){

            System.out.print("Enter the width of object "+i+":");
            int width=sc.nextInt();
            System.out.print("Enter the height of object "+i+":");
            int height=sc.nextInt();
            System.out.print("Enter the length of object "+i+":");
            int length=sc.nextInt();
            

            Box b=new Box(width, height, length);
            System.out.println("Volume of box "+i+" is "+ width*length*height);
   

        }


        
    }
}