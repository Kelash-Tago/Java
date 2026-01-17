public class activity1{
public static void main(String [] args){
	char a=args[1].charAt(0);
	char b=args[2].charAt(0);
	String c=args[0];
	c.replace(a,b);
	
	System.out.print(c);
    }
 }