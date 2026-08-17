class A {
    int e;

    class B {
        void pro() {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        A x1 = new A();
        x1.e = 44;
        B b1 = x1.new B();
        B b3 = x1.new B();

        A x2 = new A();
        x2.e = 22;
        B b2 = x2.new B();

        b1.pro();
        b2.pro();
        b3.pro();
    }
}