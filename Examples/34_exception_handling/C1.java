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

    public static void main(String[] args) {
        System.out.println("A");

        try {
            A x = new A();
        } catch(IOException e) {
            e.printStackTrace();
        }

        System.out.println("B");
    }
}