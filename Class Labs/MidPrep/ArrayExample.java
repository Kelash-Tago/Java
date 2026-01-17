public class ArrayExample {

    public static void main(String[] args) {
        int[] numbers = createArray();  // calling a method that returns an array

        System.out.println("Array elements:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }

    // A method that initializes and returns an array
    public static int[] createArray() {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 10; // you can use any logic here
        }
        return arr;
    }
}
