class A {
    void pro() {
        System.out.println("Hello");
    }
}

class B extends A {
    void pro() {
        System.out.println("Hi");
    }
}

class X {
    public static void main(String[] args) {
        A a = new B();

        a.pro();
    }
}