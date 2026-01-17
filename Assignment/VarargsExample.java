public class VarargsExample {

    public static int sumNumbers(int... numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        int result1 = sumNumbers(1, 2, 3, 4, 5); // Passing five numbers
        System.out.println("Sum of 1, 2, 3, 4, 5: " + result1);

        int result2 = sumNumbers(10, 20, 30); // Passing three numbers
        System.out.println("Sum of 10, 20, 30: " + result2);

        int result3 = sumNumbers(5); // Passing a single number
        System.out.println("Sum of 5: " + result3);

        int result4 = sumNumbers(); // Passing no arguments
        System.out.println("Sum of no numbers: " + result4);
    }
} 