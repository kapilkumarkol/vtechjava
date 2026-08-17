class A {
    private A() {

    }
}

class B extends A {
    B() {
        super();
    }    
}


// N2.java:9: error: A() has private access in A
//         super();
//         ^
// 1 error