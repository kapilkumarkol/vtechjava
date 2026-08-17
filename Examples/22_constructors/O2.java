class A {
    A(int x) {

    }
}

class B extends A {
    B() {
        super();
    }
}

// O2.java:9: error: constructor A in class A cannot be applied to given types;
//         super();
//         ^
//   required: int
//   found: no arguments
//   reason: actual and formal argument lists differ in length
// 1 error