public class forEachLoop{
	public static void main (String args[]){
	int array[][]={{1},{2,3},{4,5,6}};
	
	System.out.println("With nested forloop...");

	for(int i=0;i<array.length;i++){
	  for(int j=0;j<array[i].length;j++){
		System.out.print(array[i][j]+" ");
		}
	System.out.println("");

	}
//with for each loop
System.out.println("With for eachloop...");

for(int a[]:array){
	for(int b:a){
	   System.out.print(b+" ");
		}
	System.out.println("");

	}

	
	}
	
	}