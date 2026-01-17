public class staticVariable {
    public static void main(String arg[]) {
        Numbers numbers1 = new Numbers(); // Create first instance of Numbers
        Numbers numbers2 = new Numbers(); // Create second instance of Numbers

        numbers1.displayNumbers(); // Display initial values of a and b for numbers1
        numbers2.displayNumbers(); // Display initial values of a and b for numbers2

        numbers1.updateNumbers(); // Update the values of a and b using numbers1

        numbers1.displayNumbers(); // Display updated values of a and b for numbers1
        numbers2.displayNumbers(); // Display updated values of a and b for numbers2
    }
}

class Numbers {
     int a = 20; // Static variable (shared across all instances)
    static int b = 30; // Instance variable (unique to each instance)

    public void displayNumbers() {
        System.out.println("a=" + a + " b=" + b); // Print values of a and b
    }

    public void updateNumbers() {
        a = 1000; // Update static variable a
        b = 2000; // Update instance variable b
    }
}