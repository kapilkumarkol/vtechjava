abstract class X {
    X() {

    }
}

class A {
    public static void main(String[] args) {
        X a = new X();

        // error: X is abstract; cannot be instantiated
    }
}