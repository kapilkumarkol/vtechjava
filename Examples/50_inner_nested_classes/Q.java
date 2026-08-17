class A {
    void pro() {
        class B {
            private int u = 91;

            private void info() {
                System.out.println("golu");
            }
        }

        B x = new B();

        x.info();
        System.out.println(x.u);
    }

    public static void main(String[] args) {
        new A().pro();
    }
}