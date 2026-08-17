class A {
    int e = 7;

    void info() {
        System.out.println("info");
    }

    class B {

    }

    void pro() {
        System.out.println(e);

        info();

        B b = new B();
    }

    public static void main(String[] args) {
        A x = new A();
        x.pro();
    }
}