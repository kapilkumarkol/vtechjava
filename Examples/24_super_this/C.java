class X {
    int z = 99;
}

class A extends X {

    void pro() {
        System.out.println(z);
    }

    public static void main(String[] args) {
        A x = new A();

        x.pro();
    }
}