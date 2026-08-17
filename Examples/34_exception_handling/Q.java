import java.io.IOException;
import java.io.EOFException;

class X {
    void pro() throws IOException {
        System.out.println("pro in X");
    }
}

class A extends X {

    void pro() throws EOFException {
        System.out.println("pro in X");
    }
}
