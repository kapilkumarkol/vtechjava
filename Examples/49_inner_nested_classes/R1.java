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
        // new A().info();
        // error: cannot find symbol
    }
}