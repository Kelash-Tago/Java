public class question3{

      public static void main(String [] arguments){
        int odd=0,even=0;
          for(int i=0;i<arguments.length;i++){
            int num=Integer.parseInt(arguments[i]);
            if(num%2==0)
              even++;
            else
              odd++;
            }
      System.out.println("Even Numbers  : "+even);
      System.out.println("Odd Numbers  : "+odd);
    }
}