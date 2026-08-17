class X {
    int z = 99;
}

class A extends X {

    int z = 22;

    void pro() {
        System.out.println(z);
        System.out.println(super.z);
    }

    public static void main(String[] args) {
        A x = new A();

        x.pro();
    }
}