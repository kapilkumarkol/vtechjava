class X {

}

class A extends X {
    A() {
        this(12);
        super();
    }

    A(int y) {
        
    }
}



// R2.java:8: error: call to super must be first statement in constructor
//         super();
//              ^
// 1 error