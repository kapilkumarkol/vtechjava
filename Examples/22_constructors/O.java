class A {
    A(int x) {

    }
}

class B extends A {

}

// O.java:7: error: constructor A in class A cannot be applied to given types;
// class B extends A {
// ^
//   required: int
//   found: no arguments
//   reason: actual and formal argument lists differ in length
// 1 error