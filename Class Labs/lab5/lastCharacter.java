public class lastCharacter {
    public static void main(String[] args) {
        
        for(int i=0;i<args.length;i++){
           char[] Myarray=args[i].toCharArray();
           boolean a=true;
        for(int j=0;j<Myarray.length;j++){
            if(j==Myarray.length-1 && Myarray[j]>='a' && Myarray[j]<='z'){
                System.out.print((char)(Myarray[j]-32));
            }
           else if(Myarray[0]>='a' && Myarray[0]<='z' && a ){
                System.out.print((char)(Myarray[j]-32));
                a=false;
            }
            else if(Myarray[j]<'a' && j!=Myarray.length-1 && Myarray[j]!=Myarray[0]){
                System.out.print((char)(Myarray[j]+32));
            }
            else
            System.out.print(Myarray[j]);

        }
        System.out.print(" ");
           
        }
    }
}
