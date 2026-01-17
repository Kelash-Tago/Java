public class Bill {
   public static void main(String args[]){
     int units = Integer.parseInt(args[0]);
     int bill=0;
     for(int i = 1 ; i <= units ; i++ ){
	if( units >0 && units <= 100)
	bill+=2;
	else if(units >100 && units<=200)
	bill+=3;
	else if(units>200 && units <=300)
	bill+=4;
	else if(units>300 && units <=400)
	bill+=5;
	else if(units>400 && units <=500)
	bill+=6;

     }  
     System.out.println("Your bill is : "+bill);
   }

}