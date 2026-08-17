class A {
    final void pro() {
        System.out.println("Hello Maharaj ji");
    }
}

class B extends A {
    public static void main(String[] args) {
        B x = new B();

        x.pro();
    }
}