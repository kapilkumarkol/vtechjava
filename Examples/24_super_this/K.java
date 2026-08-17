class X {
    static int r = 10;
}

class A extends X {
    static void pro() {
        System.out.println(super.r);
    }

    void info() {
        System.out.println(super.r);
    }
}

