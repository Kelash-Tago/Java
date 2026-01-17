public class activity3{
public static void main (String[] args){
String str1=args[0];
String str2=args[1];
char[] MyArray1=str1.toCharArray();
char[] MyArray2=str2.toCharArray();
boolean r=true;
if(MyArray1.length == MyArray2.length){
for(int i=0;i<MyArray1.length;i++){
int b=0;

for(int j=0;j<MyArray1.length;j++){
if(MyArray1[i]==MyArray2[j]){
b++;
}

}
if(b==0){
System.out.println("Not testAnagram");
r=false;
break;
}
}

}
else{
System.out.println("Not testAnagram");
r=false;
}
if(r)
System.out.println("testAnagram");

}
}