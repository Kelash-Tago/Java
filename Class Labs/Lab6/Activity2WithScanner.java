import java.util.Scanner;
public class Activity2WithScanner {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.print("Enter String : ");
        String str=a.nextLine();
        System.out.println(str);
        char[] MyArray=str.toCharArray();

        for(int i=0;i<MyArray.length;i++){
            int num=0;
            char c=MyArray[i];
            boolean b=true;

            for(int k=0;k<i;k++){
                if(MyArray[k]==c)
                b=false;

            }
            if(b)
            for(int j=0;j<MyArray.length;j++){
                if(MyArray[j]==MyArray[i]){
                   num++;
                }
            }
            if(b && c!=' ')
            System.out.println(MyArray[i]+" : "+num);

        }
        
        
    }
}
