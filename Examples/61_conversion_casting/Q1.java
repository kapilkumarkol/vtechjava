class A {
    void pro1() {
        System.out.println("pro1 in A");
    }
} 

class B extends A {
    void pro2() {
        System.out.println("pro2 in B");
    }
}

class C extends B {
    void pro3() {
        System.out.println("pro3 in C");
    }
}

class X {
    public static void main(String[] args) {
        C c = new C();
        B b = c;
        A a = c;
        Object o = c;

        System.out.println(c.hashCode());
        c.pro1();
        c.pro2();
        c.pro3();
    }
}