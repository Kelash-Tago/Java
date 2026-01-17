public class Object{  
  public static void main(String args[]){
	Numbers numbers1=new Numbers();
	Numbers numbers2=new Numbers(numbers1);
	numbers1.displayNumbers();
	numbers2.displayNumbers();	 
	}

	}

class Numbers{
	 int a=20;
	 int b=30;
Numbers(){
	   }

Numbers(Numbers num){
	num.a=100;
	num.b=200;
	}
public void displayNumbers(){
	System.out.println("a="+a+" b="+b);
	}
     }

