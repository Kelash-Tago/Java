public class activity2{
public static void main(String [] args){ 
	int a=Integer.parseInt(args[0]);
	int b=Integer.parseInt(args[1]);
 	switch(a){
		case 1:
		if(b<20 && b>0)
		System.out.println("Capricorn");
		else if(b>19 && b<32)
		System.out.println("Aquarius");
		break;
		
		case 2:
		if(b<18 && b>0)
		System.out.println("Aquarius");
		else if(b>17 && b<32)
		System.out.println("Piscos");
		break;
		
		case 3:
		if(b<20 && b>0)
		System.out.println("Aquarius");
		else if(b>19 && b<32)
		System.out.println("Aries");
		break;
		case 4:
		if(b<20 && b>0)
		System.out.println("Aries");
		else if(b>19 && b<32)
		System.out.println("Tersus");
		break;
		case 5:
		if(b<21 && b>0)
		System.out.println("Tersus");
		else if(b>20 && b<32)
		System.out.println("Gemini");
		break;
		 
		case 6:
		if(b<21 && b>0)
		System.out.println("Gemini");
		else if(b>20 && b<32)
		System.out.println("Cancer");
		break;

		case 7:
		if(b<=22 && b>0)
		System.out.println("Cancer");
		else if(b>22 && b<32)
		System.out.println("Leo");
		break;

		case 8:
		if(b<=22 && b>0)
		System.out.println("Leo");
		else if(b>22 && b<32)
		System.out.println("Virgo");
		break;

		case 9:
		if(b<=22 && b>0)
		System.out.println("Virgo");
		else if(b>22 && b<32)
		System.out.println("Libra");
		break;

		case 10:
		if(b<=22 && b>0)
		System.out.println("Libra");
		else if(b>22 && b<32)
		System.out.println("Scorpio");
		break;

		case 11:
		if(b<=22 && b>0)
		System.out.println("Scorpio");
		else if(b>22 && b<32)
		System.out.println("Sagittarius");
		break;

		case 12:
		if(b<22 && b>0)
		System.out.println("Sagittarius");
		else if(b>=22 && b<32)
		System.out.println("Capricorn");
		break;
		
		default:
		System.out.println("invalid month");
	
}

    }
}