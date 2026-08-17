import java.io.IOException;

class X {
    void pro() throws IOException {
        System.out.println("pro in X");
    }
}

class A extends X {

    void pro() throws IOException, ClassNotFoundException {
        System.out.println("pro in X");
    }
}

// overridden method does not throw ClassNotFoundException