import java.io.IOException;

class X {
    X() throws IOException {
        System.out.println("C");
        throw new IOException();
    }
}

class A extends X {
    A() throws IOException {
        super();
    }    

    public static void main(String[] args) throws IOException {
        System.out.println("A");

        A x = new A();

        System.out.println("B");
    }
}