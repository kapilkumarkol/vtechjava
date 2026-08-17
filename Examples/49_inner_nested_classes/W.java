class A {
    static private int y = 700;

    static private void info() {
        System.out.println("hi");
    }

    class B {
        void pro() {
            System.out.println(y);
            info();
        }
    }

    public static void main(String[] args) {
        new A().new B().pro();
    }
}