class A {
    int r = 1000;

    class B {
        class C {
            class D {
                void pro() {
                    System.out.println(r);
                }
            }
        }
    }

    public static void main(String[] args) {
        A a = new A();
        A.B b = a.new B();
        A.B.C c = b.new C();
        A.B.C.D d = c.new D();

        d.pro();   
    }
}