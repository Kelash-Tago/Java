public class Question7 {
    public static void main(String[] args) {
        Area calculator = new Area();
        System.out.println("Area of circle "+calculator.calculateArea(3));
        System.out.println("Area of rectangle "+calculator.calculateArea(3, 5));
        System.out.println("Area of triangle "+calculator.calculateArea(2, 03, true));

    }
}

class Area{
    double radius;
    double length;
    double width;
    double base;
    double height;

    double calculateArea(double radius){
        return Math.PI*radius*radius;
        
    }
   double  calculateArea(double length,double width){
    return length*width;
        
    }
    double calculateArea(double base,double height,boolean isTriangle){
        if(isTriangle)
        return (base*height)/2.0;
        else 
        return 0.0;
    
    }

    

}

