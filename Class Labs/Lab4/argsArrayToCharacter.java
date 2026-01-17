public class argsArrayToCharacter {
    public static void main(String[] args) {
        String str=args[0];
        char[] Myarray=str.toCharArray();
        for(int i=0;i<Myarray.length;i++){
            System.out.println(Myarray[i]);
        }
        
    }
}
