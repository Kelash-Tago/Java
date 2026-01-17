public class question2 {
    public static void main(String[] args) {
        Calculator obj=new Calculator();
        System.out.println("Addition : "+obj.Add(6, 3));
        System.out.println("Subtraction : "+obj.subtract(6, 3));
        System.out.println("Multiplication : "+obj.multiply(6, 3));
        System.out.println("Division: "+obj.divide(6, 3));
    }
}

class Calculator{
    
    double Add(double a,double b){
        return a+b;
    }
    double subtract(double a,double b){
        return a-b;
    }
    double multiply(double a,double b){
        return a*b;
    }
    double divide(double a,double b){
        return a/b;
    }


}