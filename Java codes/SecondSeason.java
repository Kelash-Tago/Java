public class SecondSeason{
public static void main(String args[]){
String first=args[0];
String op=args[1];
 
 
int fv = Integer.parseInt(first); 

if(fv==1 || fv==2 || fv==12 || op=='+')
System.out.println("Winter");

else if(fv==3 || fv==4 || fv==5)
System.out.println("Spring");

else if(fv==6 || fv==7 || fv==8)
System.out.println("Summer");

else if(fv==9 || fv==10 || fv==11)
System.out.println("Autumn");

}

}