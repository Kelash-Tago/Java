public class Table {
public static void main(String args[]){
String first=args[0]; 
String Second=args[1];
String Third=args[2];

int num1 = Integer.parseInt(first); 
int num2 = Integer.parseInt(Second); 
int num3 = Integer.parseInt(Third); 
for(int i=num2;i<=num3;i++){
int a=num1*i;
System.out.println(num1 + "*"+i+"=" + a );


}

}
}