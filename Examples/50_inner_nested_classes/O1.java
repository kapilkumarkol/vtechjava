// O1.java:3: error: cyclic inheritance involving A

class A extends A.B {
    class B {

    }
}