public class toLowerCase{
 public static void main(String args []){
	String Name="KELASH";
	int a=Name.length();
	String str=Name.toLowerCase();
	System.out.println(str);
	System.out.println(a);
	char Arr[]=Name.toCharArray();
	for(int i=0;i<Name.length();i++){
		System.out.println(Character.toLowerCase(Arr[i]));
		}

      
	}

}