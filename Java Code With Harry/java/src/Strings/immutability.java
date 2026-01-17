package Strings;

public class immutability {
    public static void main(String[] args) {
        String str = "Hello";
        str.concat(" World"); // Creates a new String, does not modify original
        str="Kelash";

        System.out.println(str);  // Still prints "Hello"
    }
}
