abstract class X {
    void pro() {
        System.out.println("Golu");
    }
}

class A {
    public static void main(String[] args) {
        X a = new X();

        a.pro();
    }
}

// error: X is abstract; cannot be instantiated