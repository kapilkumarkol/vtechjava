class X {
    static int z = 99;

    static void info() {
        System.out.println("info in X");
    }
}

class A extends X {

    static void info() {
        System.out.println("info in A");
    }

    static int z = 22;

    void pro() {
        System.out.println(z);
        System.out.println(super.z);
        info();
        super.info();
    }

    public static void main(String[] args) {
        A x = new A();

        x.pro();
    }
}