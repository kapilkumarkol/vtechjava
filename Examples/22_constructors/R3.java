class X {

}

class A extends X {
    A() {
        super();
        this(12);
        
    }

    A(int y) {
        
    }
}

// R3.java:8: error: call to this must be first statement in constructor
//         this(12);
//             ^
// 1 error

