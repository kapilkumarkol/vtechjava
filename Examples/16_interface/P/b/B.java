package b;

import a.A;

class B implements A {
    public void pro() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        B a = new B();

        a.pro();
    }
}