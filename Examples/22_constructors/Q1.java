class A {
    A() {
        this(12);
    }

    A(int y) {
        this();
    }
}

// Q1.java:2: error: recursive constructor invocation
//     A() {
//     ^
// 1 error