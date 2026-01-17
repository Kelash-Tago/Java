public class CharacterRepetition{
  public static void main (String[] args){
	String str1="";
       for(int i = 0 ; i<args.length ;i++){
      str1+=args[i];
      }
	String str=str1.toLowerCase();

	char [] arr =str.toCharArray();
	

  for(int i =0 ; i<arr.length ;i++){
     	boolean isUnique=true;

	for(int k=0;k<i;k++){
	if(arr[k]==arr[i]){
	isUnique=false;
	break;}

	}
	
        int count=0;
	if(isUnique)
	for(int j = 0 ; j< arr.length ; j++){
	
	if(arr[i]==arr[j])
	count++;

	}
	if(isUnique)
	System.out.println(arr[i]+" "+count);

    }
  }

}