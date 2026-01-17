public class SeparateArgs{
  public static void main(String[] args){
  for(int i =0 ; i<args.length ;i++){
     char [] arr =args[i].toCharArray();
	for(int j = 0 ; j< arr.length ; j++){
	System.out.println(arr[j]);
	}
    }
  }

}