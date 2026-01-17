public class methodOverloading {
    public static void main(String args[]) {
        methodOverload obj = new methodOverload();
        obj.call(1); 
    }
}

class methodOverload {
    public void call(int i) {
        System.out.println("Here in int");
    }
    public void call(byte i) {
        System.out.println("Here in byte");
    }
}
