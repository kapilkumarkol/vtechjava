class A {

}

class B extends A {

}

class C extends B {

}

class X {
    public static void main(String[] args) {
        C x = new C();

        B y = new C();

        A z = new C();

        Object t = new C();
    }
}