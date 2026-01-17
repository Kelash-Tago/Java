import java.util.Scanner;
class Area{
    double length;
    double width;
    void setDim(double length,double width){
        this.length=length;
        this.width=width;
    }
    double getArea(){
        return length*width;
    }
}
public class question8 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter length : ");
        double length=sc.nextDouble();
        System.out.print("Enter width : ");
        double width=sc.nextDouble();
        Area rectangle=new Area();
        rectangle.setDim(length, width);
        System.out.println("Area of the rectangle is "+rectangle.getArea());
sc.close();
        
    }
}
