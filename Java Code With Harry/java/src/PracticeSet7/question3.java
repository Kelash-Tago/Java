public class question3 {
    static int sum(int n) {
        if (n == 0)  // Base case to stop recursion
            return 0;
        return n + sum(n - 1);
    }

    public static void main(String[] args) {
        int a = 100;
        System.out.println(sum(a)); // Output: 3 (2 + 1 + 0)
    }
}
