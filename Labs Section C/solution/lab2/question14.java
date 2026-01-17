import java.util.Scanner;
public class question14 {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter sentence :");
      String sentence=sc.nextLine();
      String [] arr=sentence.split(" ");
      int countWords=0;
      int countChar=0;
      for(String word:arr){
        countWords++;
        for(char a:word.toCharArray()){
            countChar++;
        }

      }
      System.out.println("Number of words : "+countWords);
      System.out.print("Number of charcters : "+countChar);

    }

}
