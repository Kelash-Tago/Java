public class reverse{
public static void main(String [] arguments){
String value ="Hello World Hello World";
char[] Myarray=value.toCharArray();
char[] Myarray2=value.toCharArray();

for(int m=0, i=Myarray.length-1;i>=0;i--,m++){
Myarray2[m]=Myarray[i];
}

for(int i=0;i<Myarray2.length;i++){
System.out.print(Myarray2[i]);
}

}
}