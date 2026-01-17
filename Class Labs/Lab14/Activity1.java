public class Activity1{
public static void main(String args[]){
	try{
	int result=10/0;
}catch(ArithmeticException e){
	System.out.println("Caught Arithmetic Exception: "+e.getMessage());
}

try{
   String str=null;
   System.out.println(str.length());
}catch(NullPointerException e){
System.out.println("Caught NullPointerException: "+e.getMessage());
}


try {
int[] arr ={1,2,3};
System.out.println(arr[5]);
}catch(ArrayIndexOutOfBoundsException e){
     System.out.println("Caught ArrayIndexOutOfBoundsException: "+e.getMessage());

}



try {
	int number=Integer.parseInt("abc");
}catch(NumberFormatException e){
     System.out.println("Caught NumberFormatException: "+e.getMessage());

}


try {
	Object obj=new Integer(100);
	String s=(String) obj;
}catch(ClassCastException e){
     System.out.println("Caught ClassCastException : "+e.getMessage());

}



try {
	Thread t = new Thread();
	t.setPriority(20);
}catch(IllegalArgumentException e){
     System.out.println("Caught IllegalArgumentException: "+e.getMessage());

}

try{
 java.util.Scanner sc=new java.util.Scanner(System.in);
	sc.close();
	sc.next();
}catch(IllegalStateException e){
     System.out.println("Caught IllegalStateException: "+e.getMessage());

}




   }// main method

}// main class
