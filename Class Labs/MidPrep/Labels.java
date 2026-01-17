public class Labels{
    public static void main(String args[]){
	boolean t=true;
	first:{
	second:{
	third:{
	System.out.println("This is before break. ");
	if(t)
	break first;
	System.out.println("This will not print. ");
	  
	   }
	System.out.println("This will not print. ");
	  }
	System.out.println("This will not be printed. ");
	}
	System.out.println("This is out of blocks and will be printed. ");

   }
}