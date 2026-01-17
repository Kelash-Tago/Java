class Outer {
private String message = "Hello from Outer class!";
class Inner {
void display() {
System.out.println(message);
}
}
}
public class nested2 {
public static void main(String[] args) throws Exception {
Outer outer = new Outer();
Outer.Inner inner = outer.new Inner();
inner.display();
}
} 