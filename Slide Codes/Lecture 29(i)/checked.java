import java.io.FileInputStream;

public class checked{
    public static void main(String args[]){
        try{
            FileInputStream ob = new FileInputStream("unchecked.java");
        } catch(Exception ex){
            ex.printStackTrace();
        }
    }
} 