public class Lab5Activity1 {
    public static void main(String[] args) {
        
        for(int i=0;i<args.length;i++){
           char[] Myarray=args[i].toCharArray();
        for(int j=0;j<Myarray.length;j++){
            if(Myarray[j]>='a' && Myarray[j]<='z' ){
                System.out.print((char)(Myarray[j]-32));

            }
            else
            System.out.print(Myarray[j]);

        }
        System.out.print(" ");
           
        }
    }
}
