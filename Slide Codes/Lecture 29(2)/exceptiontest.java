class InvalidPath extends Exception {
public InvalidPath(String message) {
super(message);
}
}

class MyResource {
public MyResource(String path) throws InvalidPath {
if (path == null || path.isEmpty()) {
throw new InvalidPath("Path is null or empty");
}
}
}

class InvalidPathUnchecked extends RuntimeException {
public InvalidPathUnchecked(String message) {
super(message);
}
}

class MyResource1 {
public MyResource1(String path) {
if (path == null || path.isEmpty()) {
throw new InvalidPathUnchecked("Path is null or empty");
}
}
}

public class exceptiontest{
public static void main(String args[]){
MyResource1 ob = new MyResource1(null);
}
} 