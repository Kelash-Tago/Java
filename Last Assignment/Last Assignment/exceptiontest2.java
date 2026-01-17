class InvalidPath extends Exception {
    public InvalidPath(String message) {
        super(message);
    }
}

class MyResource {
    public MyResource(String path) throws InvalidPath {
        if (path == null || path.isEmpty()) {
            throw new InvalidPath("path is empty");
        }
    }
}

public class exceptiontest2 {
    public static void main(String args[]) {
        try {
            MyResource ob = new MyResource(null);
            System.out.println(ob);
        } catch(InvalidPath ex) {
            System.out.println(ex.getMessage());
        }
    }
}