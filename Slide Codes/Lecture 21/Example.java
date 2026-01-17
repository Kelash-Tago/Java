public class Example {
    public static void printNumbers(int... numbers) {
        if (numbers.length == 0) {
            System.out.println("No values");
            return;
        }
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    public static void printNumbers(int[] numbers) {
        if (numbers.length == 0) {
            System.out.println("No values");
            return;
        }
        for (int number : numbers) {
            System.out.println(number);
        }
    }
    

    public static void main(String[] args) {
        // Create an array of integers
        int[] numbers = {1, 2, 3};
        printNumbers(numbers); 
        printNumbers(4, 5, 6); 
        printNumbers();       
    }
} 