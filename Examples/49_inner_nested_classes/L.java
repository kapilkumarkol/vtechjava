class A {
    int r = 11;

    class B {
        void pro() {
            System.out.println("hello");
        }
    }

    public static void main(String[] args) {
        A a = new A();

        B b = a.new B();

        b.pro();
    }
}