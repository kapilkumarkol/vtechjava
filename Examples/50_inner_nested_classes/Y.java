class X {
    //nested class
    static class B {

    }

    //inner class
    class C {

    }
}

class A {
    public static void main(String[] args) {
        X.B x = new X.B();

        X.C y = new X().new C();
    }
}
