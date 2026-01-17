class A {
    A() {
        super();
        System.out.println("Inside A's constructor.");
    }
}

class B extends A {
    B() {
        super();
        System.out.println("Inside B's constructor.");
    }
}

class C extends B {
    C() {
        super();
        System.out.println("Inside C's constructor.");
    }
}

class CallingCons {
    public static void main(String args[]) {
        C c = new C();
    }
} 