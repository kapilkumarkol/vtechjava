class A {
    void pro() {
        info();
    }

    void  info() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        A x = new A();

        x.pro();
    }
}