public class unchecked{
    public static void main(String args[]){
        A[] ab = new A[2];
        try{
            System.out.println(ab[0].a);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
}

class A{
    String a="aa";
} 