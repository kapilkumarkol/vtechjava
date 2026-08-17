class A {
    class B {
        void info() {
            pro();
        }
    }

    void pro() {
        System.out.println("Haha");
    }

    public static void main(String[] args) {
        // new A().new B().pro();
        // error: cannot find symbol
    }
}