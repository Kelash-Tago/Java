public class activity1{
public static void main(String [] args){
String str="";
for(int i=0;i<args.length;i++){
str=str+args[i];
   }
char[] MyArray=str.toCharArray();

for(int i=0;i<MyArray.length;i++){
int num=0;
boolean a=true;
char character=MyArray[i];
for(int n=0;n<i;n++){
if(character==MyArray[n])
 a=false;
}
if(a)
  for(int j=0;j<MyArray.length;j++){
	if(MyArray[j]==MyArray[i])
	num++;
         }
	
	System.out.println(MyArray[i]+" : "+ num);
	a=false;
	
 
      }

    }
}