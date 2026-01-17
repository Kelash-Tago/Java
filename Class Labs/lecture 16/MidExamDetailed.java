public class MidExamDetailed {
    public static void main(String arg[]) {
        // Step 1: Initialize a
        int a = -40;
        System.out.println("Step 1: a = " + a);
        System.out.println("Binary representation of a: " + Integer.toBinaryString(a));
        
        // Step 2: Right shift operation
        int b = a >> 2;
        System.out.println("\nStep 2: b = a >> 2");
        System.out.println("Binary representation of a >> 2: " + Integer.toBinaryString(b));
        System.out.println("Value of b after shift: " + b);
        
        // Step 3: Post-increment operation
        int c = b++;
        System.out.println("\nStep 3: c = b++");
        System.out.println("Value assigned to c: " + c);
        System.out.println("Value of b after increment: " + b);
        
        // Final values
        System.out.println("\nFinal values:");
        System.out.println("a=" + a + " b=" + b + " c=" + c);
    }
} 