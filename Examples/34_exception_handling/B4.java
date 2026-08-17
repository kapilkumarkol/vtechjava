import java.io.IOException;

class X {
    X() throws IOException {
        System.out.println("C");
    }
}

class A extends X {
    A() throws IOException {
        super();
    }    
}