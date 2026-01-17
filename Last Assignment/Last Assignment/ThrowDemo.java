class ThrowDemo {
    static void demo() {
        NullPointerException e = new NullPointerException("demo");
        throw e;
    }

    public static void main(String args[]) {
        try {
            demo();
        } catch (NullPointerException e) {
            System.out.println("Caught inside demo:");
            System.out.println(e);
        }
    }
}

null pointer exception