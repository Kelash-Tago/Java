public class BinaryToDecimal{
   public static void main(String args[]){
	char arr[]=args[0].toCharArray();
	int decimal=0;
	for(int m=0,i=arr.length-1;i>=0;i--,m++){
	 int bit=Character.getNumericValue(arr[i]);

	if(bit==0)
	continue;
	else {
		if(m==0)
		decimal++;
 		else{
		int sum=1;
		for(int l=1;l<=m;l++){
			sum=sum*2;
			}
	    decimal=decimal+sum;}
	}
         }
	System.out.println("Decimal number of "+args[0]+" is "+decimal);
  }
}