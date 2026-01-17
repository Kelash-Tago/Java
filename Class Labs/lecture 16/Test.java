public class Test {
    public static void main(String[] args) {
        int i = -200;  // Declare an int variable with value -200
        byte b = (byte) i;  // Cast the int to a byte
        System.out.println("Original int value: " + i);
        System.out.println("After casting to byte: " + b);
        
        // Show binary representation to understand the conversion
        System.out.println("\nBinary representation:");
        System.out.println("int  i = " + Integer.toBinaryString(i));
        System.out.println("byte b = " + Integer.toBinaryString(b & 0xFF));
    }
} 