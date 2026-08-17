class X {
    X(int q) {
        System.out.println(q);
    }
}

class A extends X {
    static int y = 2;

    A() {
        super(y);
    }

    public static void main(String[] args) {
        A a = new A();
    }
}

