public class FirstLetterUpperCase{
  public static void main(String[] args){
  for(int i =0 ; i<args.length ;i++){
     char [] arr =args[i].toCharArray();
	for(int j = 0 ; j< arr.length ; j++){
	char c =arr[j];
	if(c>='a' && c<= 'z' && j==0)
	System.out.print((char)(c-32));
	else if(c>='A' && c<='Z' && j!=0)
	System.out.print((char)(c+32));
	else 
	System.out.print(arr[j]);
	}
	System.out.print(" ");

    }
  }

}