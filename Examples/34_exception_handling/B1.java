import java.io.IOException;

class X {
    X() throws IOException {
        System.out.println("C");
    }
}

class A extends X {
    A() {

    }    
}

// B1.java:10: error: unreported exception IOException; must be caught or declared to be thrown
//     A() {
//         ^
// 1 error