class X {
    int u = 900;
}

class A extends X {

    int u = 33;

    void pro() {
        // int u = 12;
        System.out.println(u);
        System.out.println(this.u);
        System.out.println(super.u);
    }

    public static void main(String[] args) {
        A a = new A();

        a.pro();
    }
}