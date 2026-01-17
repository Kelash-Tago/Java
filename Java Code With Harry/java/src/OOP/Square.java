package OOP;
import java.util.Scanner;
class MyClass{
    int side;

    public void initializeSize(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Entetr one side of object ");
        int a=sc.nextInt();
        side=a;
    }

    public int Area(){
        int a =side*side;
        return a;
    }

    public int Perimeter(){
        return side*4;
        
    }
}


public class Square {
    public static void main(String[] args) {
        MyClass square=new MyClass();
        square.initializeSize();
        System.out.println("Area of Square is "+ square.Area() );
        System.out.println("Perimeter of square is "+ square.Perimeter());



        
    }
    
}
