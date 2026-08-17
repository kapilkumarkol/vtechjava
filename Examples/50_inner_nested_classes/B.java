class A {
    static int y = 343;

    static void pro() {
        class B {
            void info() {
                System.out.println(y);
                // error: non-static variable y cannot be referenced from a static context
            }
        }

        B b = new B();
        b.info();
    }
    
    public static void main(String[] args) {
        pro();
    }
}