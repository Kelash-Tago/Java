class Grandparent {
    Grandparent() {
        System.out.println("Grandparent constructor");
    }
}

class Parent extends Grandparent {
    Parent() {
        // Implicit super() call to Grandparent()
        System.out.println("Parent constructor");
    }
    
    Parent(String message) {
        this(); // Calls Parent() constructor
        System.out.println("Parent overloaded: " + message);
    }
}

class Child extends Parent {
    Child() {
        super("Hello"); // Explicit call to Parent(String)
        System.out.println("Child constructor");
    }
}

public class ConstructorChainDemo {
    public static void main(String[] args) {
        new Child();
    }
}