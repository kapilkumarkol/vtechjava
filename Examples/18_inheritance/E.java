// Hierarchichal Inheritance

class A {
    void info() {
        System.out.println("Golu Chacha");
    }
}

class B extends A { }
class C extends A { }
class D extends A { }

class X {
    public static void main(String[] args) {
        B b = new B();

        C c = new C();

        D d = new D();

        b.info();
        c.info();
        d.info();
    }
}