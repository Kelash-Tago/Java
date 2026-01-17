public class ExceptionTest3 {
public static void main(String args[]){
int a=0;
int b = 10;
try{
int c = b/a;
}
catch(ArithmeticException ex){
}
System.out.println("will execute");
}
} 