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
        Object o = new C();

        // System.out.println(o.hashCode());
        // o.pro1();
        // o.pro2();
        // o.pro3();

        C x = (C)o;
        System.out.println(x.hashCode());
        x.pro1();
        x.pro2();
        x.pro3();
    }
}