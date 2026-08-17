class A {
    void pro() {
        class B {
            static int u = 9;

            static void pro() {

            }
        }
    }
}


// error: Illegal static declaration in inner class B
// modifier 'static' is only allowed in constant variable declarations