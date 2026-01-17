public class practice {
    public static void main(String[] args){
        for(int i=0;i<args.length;i++){
            char[] Myarray=args[i].toCharArray();
            for (int j = 0; j <Myarray.length; j++) {
                if(j%2==0){
                    if(Myarray[j]>='a')
                    System.out.print((char)(Myarray[j]-32));
                    else
                    System.out.print(Myarray[j]);
                }
                else {
                    if(Myarray[j]<'a')
                    System.out.print((char)(Myarray[j]+32));
                    else
                    System.out.print(Myarray[j]);

                }
                
            }
            System.out.print(" ");
        }
    }
    
}
