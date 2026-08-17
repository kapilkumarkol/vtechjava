class A {
    void info(A w) {
        System.out.println(w == this);
    }

    void pro() {
        info(this);
    }

    public static void main(String[] args) {
        A x = new A();

        x.pro();
    }
}