class A {

    class B {
        private float y = 88;

        private void info() {
            System.out.println("info-");
        }
    }

    public static void main(String[] args) {
        A x = new A();
        B t = x.new B();
        
        System.out.println(t.y);
        t.info();
    }
}