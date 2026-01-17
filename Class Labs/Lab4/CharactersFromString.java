public class CharactersFromString {
    public static void main(String args[]) {
        // Check if a command-line argument is provided
        if (args.length == 0) {
            System.out.println("Please provide a string as a command-line argument.");
            return;
        }

        String str = args[0];
        char[] charry = str.toCharArray();

        // Loop through the array starting from index 0
        for (int i = 0; i < charry.length; i++) {
            System.out.println(charry[i]);
        }
    }
}