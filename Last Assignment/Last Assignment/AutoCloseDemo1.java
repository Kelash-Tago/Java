import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;



public class AutoCloseDemo1 {
    public static void main(String[] args) {
        String filepath = "sample.txt";

        try (FileInputStream fis = new FileInputStream(filepath)) {
            // code to read file
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
