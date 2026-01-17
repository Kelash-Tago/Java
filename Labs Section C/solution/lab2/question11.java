import java.util.Scanner;

public class question11 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter String : ");
      String str = scanner.nextLine();
      System.out.print("Enter character : ");
      char character=scanner.next().charAt(0);
      char[] arr=str.toLowerCase().toCharArray();
      int count=0;
      for (int i = 0; i <arr.length; i++) {
        if(arr[i]==character)
        count++;
      }
      System.out.println("Number of character '"+character+"' are : "+count);
      scanner.close();  
    }
}
