public class exceptiontest1 {
    public static void main(String args[]) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]);
            String text = null;
            System.out.println(text.length());
            int result = 10 / 0;
        } catch (ArrayIndexOutOfBoundsException | NullPointerException | ArithmeticException ex) {
        }
    }
}
//there is one try and multiple classes of catch.