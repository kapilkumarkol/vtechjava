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

    public static void main(String[] args) {
        System.out.println("A");

        A x = new A();

        System.out.println("B");
    }
}

// C.java:17: error: unreported exception IOException; must be caught or declared to be thrown
//         A x = new A();
//               ^
// 1 error