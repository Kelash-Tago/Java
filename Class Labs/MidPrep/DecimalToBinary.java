public class DecimalToBinary{
   public static void main(String args[]){
	int num=Integer.parseInt(args[0]);
	String str="";

	while(true){
	int remainder=num%2;
	num=num/2;
	String r=Integer.toString(remainder);
	str+=r;

	if(num==1 || num==0){
	str=str+Integer.toString(num);
	break;
	}
		
      }
	char arr[]=str.toCharArray();
	for(int i=arr.length-1;i>=0;i--){
	System.out.print(arr[i]);
	}
	//System.out.println("Binary number of "+args[0]+" is :"+str.reverse());
   }
}