class A {
    static int y = 19;
}

class B extends A {
    static int y = 13;
}

class X {
    public static void main(String[] args) {
        A a = new B();

        System.out.println(a.y);
    }
}