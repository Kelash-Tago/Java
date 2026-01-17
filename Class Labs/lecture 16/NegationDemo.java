class NegationDemo {
    public static void main(String args[]) {
        // Integer negation
        int num1 = 50;
        System.out.println("Original number: " + num1);
        System.out.println("Negated number: " + (-num1));
        
        // Double negation
        double num2 = 25.5;
        System.out.println("\nOriginal double: " + num2);
        System.out.println("Negated double: " + (-num2));
        
        // Negating a negative number
        int num3 = -30;
        System.out.println("\nOriginal negative number: " + num3);
        System.out.println("Negated negative number: " + (-num3));
        
        // Using unary minus operator
        int x = 100;
        x = -x;  // Unary minus operator
        System.out.println("\nAfter unary minus: " + x);
        
        // Binary representation
        int num4 = 42;
        System.out.println("\nBinary representation:");
        System.out.println("Positive number: " + Integer.toBinaryString(num4));
        System.out.println("Negative number: " + Integer.toBinaryString(-num4));
    }
} 