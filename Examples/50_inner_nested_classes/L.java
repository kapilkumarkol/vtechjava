class A {
    void pro() {
        // error: cannot access B
        // B b = new B(); //NOT OK

        class B {

        }

        B x = new B(); //OK
    }
}