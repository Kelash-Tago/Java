import java.util.Scanner;
public class activity1{
  public static void main (String args[]){
	WorkOnArray ob=new WorkOnArray();
	ob.printNumbers();
	System.out.println("The sum is : "+ob.Sum());

	}
 
}

class WorkOnArray{
Scanner scan = new Scanner(System.in);

int[] numbers=new int[10];
 WorkOnArray(){
 	setNumbers();
	}
	 
void printNumbers(){
	System.out.println("Printing :");
	for(int i=0;i<numbers.length;i++){
	System.out.print(numbers[i]+" ");
	}
        System.out.println("");
	}


void setNumbers(){

	for(int i=0;i<numbers.length;i++){
	System.out.print("Enter array element "+(int)(i+1)+" : ");

	numbers[i]=(scan.nextInt());
	}
	}
	 
int Sum(){
	int sum=0;
        for(int i=0;i<numbers.length;i++){
	sum=sum+numbers[i];

	}

	return sum;
	}

	
}