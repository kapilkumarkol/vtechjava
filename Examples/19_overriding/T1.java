class A {
    static void pro() {

    }
}

class B extends A {
    void pro() {
        
    }
}

/*
T1.java:8: error: pro() in B cannot override pro() in A
    void pro() {
         ^
  overridden method is static
1 error
 */