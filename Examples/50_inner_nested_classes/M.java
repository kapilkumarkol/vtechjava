class A {
    
    void pro() {
        class B {

        }

        B x = new B(); //OK
    }

    void info() {
        // M.java:12: error: cannot find symbol
        A.B x;
    }
}