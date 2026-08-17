import java.io.IOException;

class X {
    X() throws IOException {
        System.out.println("C");
    }
}

class A extends X {
    A() {
        super();
    }    
}


// B2.java:11: error: unreported exception IOException; must be caught or declared to be thrown
//         super();
//              ^
// 1 error