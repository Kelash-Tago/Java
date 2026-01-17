public class ByteShiftDemo {
    public static void main(String args[]) {
        byte b = 64;  // Initialize a byte value
        
        // Right shift
        System.out.println("Original value of b: " + b);
        b = (byte)(b >> 1);
        System.out.println("After b >> 1: " + b);
        
        // Left shift
        b = 64;  // Reset b to original value
        System.out.println("\nOriginal value of b: " + b);
        b = (byte)(b << 1);
        System.out.println("After b << 1: " + b);
        
        // Multiple shifts
        b = 64;  // Reset b to original value
        System.out.println("\nOriginal value of b: " + b);
        System.out.print("b + \"*\": ");
        System.out.println(b + "*");
        
        // Demonstrate multiple shifts
        b = (byte)(b >> 2);
        System.out.println("After b >> 2: " + b);
        
        b = 64;  // Reset again
        b = (byte)(b << 2);
        System.out.println("After b << 2: " + b);
    }
} 