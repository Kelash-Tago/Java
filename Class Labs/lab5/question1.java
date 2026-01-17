public class question1{
    public static void main(String[] args) {
        
        for(int i=0;i<args.length;i++){
           char[] Myarray=args[i].toCharArray();
           boolean a=true;
        for(int j=0;j<Myarray.length;j++){
            if(Myarray[0]>='a' && Myarray[0]<='z' && a ){
                System.out.print((char)(Myarray[j]-32));
                a=false;
            }
            else
            System.out.print(Myarray[j]);

        }
        System.out.print(" ");
           
        }
    }
}