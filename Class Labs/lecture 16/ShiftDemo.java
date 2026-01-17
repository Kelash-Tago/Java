class ShiftDemo {
    public static void main(String args[]) {
        // Demonstrate right shifts
        int num = 35;  // Positive number
        System.out.println("Original number: " + num);
        System.out.println("Binary: " + Integer.toBinaryString(num));
        
        // Signed right shift
        System.out.println("\nSigned Right Shift (>>):");
        System.out.println("num >> 1 = " + (num >> 1));
        System.out.println("num >> 2 = " + (num >> 2));
        
        // Unsigned right shift
        System.out.println("\nUnsigned Right Shift (>>>):");
        System.out.println("num >>> 1 = " + (num >>> 1));
        System.out.println("num >>> 2 = " + (num >>> 2));
        
        // Demonstrate with negative number
        int negNum = -35;
        System.out.println("\nNegative number: " + negNum);
        System.out.println("Binary: " + Integer.toBinaryString(negNum));
        
        // Signed vs Unsigned right shift for negative number
        System.out.println("\nSigned Right Shift of negative number:");
        System.out.println("negNum >> 1 = " + (negNum >> 1));
        System.out.println("Binary: " + Integer.toBinaryString(negNum >> 1));
        
        System.out.println("\nUnsigned Right Shift of negative number:");
        System.out.println("negNum >>> 1 = " + (negNum >>> 1));
        System.out.println("Binary: " + Integer.toBinaryString(negNum >>> 1));
        
        // Left shift (same for both signed and unsigned)
        System.out.println("\nLeft Shift (<<):");
        System.out.println("num << 1 = " + (num << 1));
        System.out.println("num << 2 = " + (num << 2));
        System.out.println("Binary of num << 1: " + Integer.toBinaryString(num << 1));
    }
} 