class A {
    private A() {

    }
}

class B extends A {
    B() {

    }    
}

// N1.java:8: error: A() has private access in A
//     B() {
//         ^
// 1 error