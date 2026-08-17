class A {
    void pro() {

    }
}

class B extends A {
    static void pro() {
        
    }
}

/*
T2.java:8: error: pro() in B cannot override pro() in A
    static void pro() {
                ^
  overriding method is static
1 error
 */