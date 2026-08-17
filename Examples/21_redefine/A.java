class A {
    int y = 9;
}

class B extends A {
    int y = 3;
}

class X {
    public static void main(String[] args) {
        A a = new B();

        System.out.println(a.y);
    }
}