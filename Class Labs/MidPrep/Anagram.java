public class Anagram{
    public static void main(String args[]){
	
	String str1=args[0].toLowerCase();
	String str2=args[1].toLowerCase();
	char[] arr1=str1.toCharArray();
	char[] arr2=str2.toCharArray();
	
	boolean isAnagram=true;
	if(str1.length()==str2.length())
	for(int i = 0;i<arr1.length;i++){
	char c=arr1[i];
	int count1=0;
	int count2=0;
	    for(int j=0 ;j<arr1.length;j++){
		if(c==arr1[j]){
			count1++;
			}
		}
	    for(int k=0;k<arr2.length;k++){
		if(c==arr2[k]){
			count2++;
			}
		}
	if(count1!=count2)
	isAnagram=false;
	}

	
	if(isAnagram && arr1.length==arr2.length)
	System.out.println("words are Anagram");
	else
	System.out.println("words are not Anagram");

	
	
    }
}