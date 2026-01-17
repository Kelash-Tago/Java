public class question7 {
    public static void main(String[] args) {
        String str = "";
        for(int i=0;i<args.length;i++){
           str=str+args[i];
        }
        char[] Myarray=str.toCharArray();
        for(int i=0;i<Myarray.length;i++){
            System.out.println(Myarray[i]);
        }
    }
}
