public class Sum{
  public static void main (String args[]){
	
	int sum=sum(5,6);
        System.out.println("The sum of two numbers is "+sum);
	sum=sum(5,6,4);
        System.out.println("The sum of 3 numbers is "+sum);

	 sum=sum(5,6,4,5,6,4);
        System.out.println("The sum of  numbers is "+sum);
	 sum=sum(5,6);
        System.out.println("The sum of  numbers is "+sum);
	
	}

	
	 
public static int sum(int a,int b){
	System.out.println("Method 1 executed");
	return a+b;
	}
public static int sum(int a,int b,int c){
	System.out.println("Method 2 executed");
	return a+b+c;
	}
public static int sum(int a,int b,int ... c){
	int total=a+b;
	for(int i:c){
	total+=i;
	}
	return total;
	}
   }
