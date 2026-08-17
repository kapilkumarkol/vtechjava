class A {
    int y = 3;

    class B extends X {
        // int y = 9;

        void pro() {
            // int y = 7;

            System.out.println(y);
        }
    }

    public static void main(String[] args) {
        new A().new B().pro();
    }
}

class X extends Y {
    // int y = 11;
}

class Y {
    int y = 22;
}