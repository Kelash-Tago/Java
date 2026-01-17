class CharAtDemo {
    public static void main(String args[]) {
        String str = "Hello World";
        
        // Print each character with its index
        System.out.println("Characters in the string '" + str + "':");
        for(int i = 0; i < str.length(); i++) {
            System.out.println("Character at index " + i + ": " + str.charAt(i));
        }
        
        // Demonstrate some specific charAt() examples
        System.out.println("\nSome specific examples:");
        System.out.println("First character: " + str.charAt(0));    // H
        System.out.println("Last character: " + str.charAt(str.length()-1));   // d
        System.out.println("Space character: " + str.charAt(5));    // space
        
        // Error handling example
        try {
            System.out.println(str.charAt(20)); // This will cause an exception
        } catch(StringIndexOutOfBoundsException e) {
            System.out.println("Error: Index out of bounds!");
        }
    }
} 