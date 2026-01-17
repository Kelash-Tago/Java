public class ReplaceChar{
    public static void main(String args[]){
      char arr[]=args[0].toCharArray();
      char removingChar=args[1].charAt(0);
      char replacingChar=args[2].charAt(0);
      for(int i=0;i<arr.length;i++){
	if(arr[i]==removingChar){
	arr[i]=replacingChar;
	}
	System.out.print(arr[i]);
       }
    }
}