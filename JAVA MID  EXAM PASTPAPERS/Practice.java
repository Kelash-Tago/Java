public class Exercise {
    public static void main(String arg[]) {
        Numbers numbers1 = new Numbers(); // Create first instance of Numbers
        Numbers numbers2 = new Numbers(); // Create second instance of Numbers

        numbers1.displayNumbers(); // Display initial values of a and b for numbers1
        numbers2.displayNumbers(); // Display initial values of a and b for numbers2

        numbers1.updateNumbers(numbers2); // Update the values of a and b for numbers2 using numbers1

        numbers1.displayNumbers(); // Display values of a and b for numbers1
        numbers2.displayNumbers(); // Display updated values of a and b for numbers2
    }
}

class Numbers {
    int a = 20; // Instance variable
    int b = 30; // Instance variable

    public void displayNumbers() {
        System.out.println("a=" + a + " b=" + b); // Print values of a and b
    }

    public void updateNumbers(Numbers numbers) {
        numbers.a += 20; // Update a for the passed instance
        numbers.b += 30; // Update b for the passed instance
    }
}