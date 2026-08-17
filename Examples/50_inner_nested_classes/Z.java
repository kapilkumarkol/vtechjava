class X {
    //nested class
    static class B {
        void pro() {
            System.out.println("pro in nested class B");
        }
    }
}

class A {
    public static void main(String[] args) {
        X.B x = new X.B();

        x.pro();
    }
}
