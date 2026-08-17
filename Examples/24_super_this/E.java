class X {
    int z = 99;

    void info() {
        System.out.println("info in X");
    }
}

class A extends X {

    void info() {
        System.out.println("info in A");
    }

    int z = 22;

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