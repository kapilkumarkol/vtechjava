class A {
    int y = 3;

    class B {
        // int y = 9;

        void pro() {
            // int y = 7;

            System.out.println(y);
        }
    }

    public static void main(String[] args) {
        new A().new B().pro();
    }
}