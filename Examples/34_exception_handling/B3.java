import java.io.IOException;

class X {
    X() throws IOException {
        System.out.println("C");
    }
}

class A extends X {
    A() {
        try {
            super();
        } catch(IOException e) {

        }
    }    
}

// B3.java:12: error: call to super must be first statement in constructor
//             super();
//                  ^
// 1 error