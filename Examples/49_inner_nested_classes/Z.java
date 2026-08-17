class A {
    private static int x = 900;

    private static void golu() {
        System.out.println("hi....");
    }

    void pro() {
        class B {
            void info() {
                System.out.println(x);
                golu();
            }
        }

        B t = new B();
        t.info();
    }

    public static void main(String[] args) {
        A a = new A();

        a.pro();
    }
}