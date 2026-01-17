class A {
    A() {
        System.out.println("Inside A's constructor.");
    }
    A(int a) {
        System.out.println("Inside A's one parameter  constructor.");
    }
}

class B extends A {
    B() {
        System.out.println("Inside B's constructor.");
    }
    B(int d) {
        System.out.println("Inside B int constructor.");
    }
}

class C extends B {
    C() {
        
        System.out.println("Inside C's constructor.");
    }
}

class CallingCons {
    public static void main(String args[]) {
        C c = new C();
    }
}