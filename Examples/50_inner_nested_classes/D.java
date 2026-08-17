class A {
    int r = 1000;

    class B {
        int r = 500;

        class C {
            int r = 200;

            class D extends Z {
                int r = 100;

                void pro() {
                    int r = 50;
                    System.out.println(r);
                    System.out.println(this.r);
                    System.out.println(super.r);
                    System.out.println(C.this.r);
                    System.out.println(B.this.r);
                    System.out.println(A.this.r);
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

class Z {
    int r = 2000;
}