// Corrected version using labeled break
class BreakFix {
    public static void main(String args[]) {

        one: // label for the outer loop
        for (int i = 0; i < 3; i++) {
            System.out.print("Pass " + i + ": ");

            for (int j = 0; j < 100; j++) {
                if (j == 10) break one; // breaks out of the 'one' loop
                System.out.print(j + " ");
            }

            System.out.println(); // prints newline after inner loop
        }

        System.out.println("Loop complete.");
    }
}
