class A {
    A(int x) {

    }
}

class B extends A {
    B() {

    }
}

// O1.java:8: error: constructor A in class A cannot be applied to given types;
//     B() {
//         ^
//   required: int
//   found: no arguments
//   reason: actual and formal argument lists differ in length
// 1 error