public class VarArgs {
    static double sum(double c, float d,int ...a){
         double sum=c+d;
        for(double i:a){
            sum=sum+i;
        }
        return sum;
    }
    public static void main(String[] args) {
     System.out.println(sum(2.5,3.12f,3,6));   
    }
    
}
