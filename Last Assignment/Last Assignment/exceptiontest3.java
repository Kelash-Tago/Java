class InvalidPathUnchecked extends RuntimeException {
    public InvalidPathUnchecked(String message) {
        super(message);
    }
}

class MyResource {
    public MyResource(String path) {
        if (path == null || path.isEmpty()) {
            throw new InvalidPathUnchecked("path is empty");
        }
    }
}

public class exceptiontest3 {
    public static void main(String args[]) {
        MyResource ob = new MyResource(null);
        System.out.println(ob);
    }
}