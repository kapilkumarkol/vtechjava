class A {
    private int r = 55;

    private void info() {
        System.out.println("hello");
    }

    class B {
        void pro() {
            System.out.println(r);
            info();
        }
    }

    public static void main(String[] args) {
        A a = new A();

        B b = a.new B();

        b.pro();
    }
}