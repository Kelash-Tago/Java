public class Bill{
public static void main (String args[]){
String first=args[0]; 
int fv = Integer.parseInt(first); 
int bill=0;
if(fv>=1 && fv<=100){
bill=fv*2;
System.out.println("Total bill is :" + bill);
}
else if(fv>=101 && fv<=200){
int temp=0;
bill=100*2;
fv=fv-100;
temp=fv*3;
bill=bill+temp;
System.out.println("Total bill is :" + bill);
}
else if(fv>=201 && fv<=300){
int temp=0;
bill=(100*2)+(100*3);
fv=fv-200;
temp=fv*4;
bill=bill+temp;
System.out.println("Total bill is :" + bill);
}

else if(fv>=301 && fv<=400){
int temp=0;
bill=(100*2)+(100*3)+(100*4);
fv=fv-300;
temp=fv*5;
bill=bill+temp;
System.out.println("Total bill is :" + bill);
}
else if(fv>=401 && fv<=500){
int temp=0;
bill=(100*2)+(100*3)+(100*4)+(100*5);
fv=fv-400;
temp=fv*6;
bill=bill+temp;
System.out.println("Total bill is :" + bill);
}


}
}