class A {
    final int y;

    A() {
        y = 80;
    }

    A(int a) {
        y = 90;
    }

    public static void main(String[] args) {
        A a = new A(2);

        System.out.println(a.y);
    }
}