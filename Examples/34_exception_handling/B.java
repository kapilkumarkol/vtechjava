import java.io.IOException;

class X {
    X() throws IOException {
        System.out.println("C");
    }
}

class A extends X {
 
    
}

// B.java:9: error: unreported exception IOException in default constructor
// class A extends X {
// ^
// 1 error