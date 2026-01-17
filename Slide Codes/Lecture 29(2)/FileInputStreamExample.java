import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamExample {
public static void main(String[] args) {
FileInputStream fileInputStream = null;

try {
fileInputStream = new FileInputStream("example.txt");
} catch (FileNotFoundException e) {
System.out.println("File not found: " + e.getMessage());
} catch (IOException e) {
System.out.println("I/O error occurred: " + e.getMessage());
} finally {
try {
if (fileInputStream != null) {
fileInputStream.close();
System.out.println("\nFileInputStream closed successfully.");
}
} catch (IOException e) {
System.out.println("Error while closing the stream: " + e.getMessage());
}
}
}
} 