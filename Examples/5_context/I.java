class A {
    static int r = 999;

    void pro() {
        System.out.println(A.r);
    }

    public static void main(String[] args) {
        A x = new A();
        x.pro();
    }
}
