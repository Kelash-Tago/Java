public class Recursion {
    static int factorial(int a){
        if (a==1 || a==0)
        return 1;
        else {
        return a*factorial(a-1);
        }
    }
    public static void main(String[] args) {
        int x=16;
        System.out.println(factorial(x));
    }
}
