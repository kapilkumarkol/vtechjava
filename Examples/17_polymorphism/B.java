class A {
    void iCanWalk() {
        System.out.println("i can walk");
    }
}

class B extends A {
    void iCanRun() {
        System.out.println("i can run");
    }
}

class C extends B {
    void iCanLaugh() {
        System.out.println("i can laugh");
    }
}

class X {

    int e;

    e=90;
    public static void main(String[] args) {
        // C x = new C();

        // x.iCanLaugh();
        // x.iCanRun();
        // x.iCanWalk();
        // System.out.println(x.toString());

        // B y = new C();

        // // y.iCanLaugh();
        // y.iCanRun();
        // y.iCanWalk();
        // System.out.println(y.toString());

        // A z = new C();

        // // z.iCanLaugh();
        // // z.iCanRun();
        // z.iCanWalk();
        // System.out.println(z.toString());

        Object t = new C();

        // t.iCanLaugh();
        // t.iCanRun();
        // t.iCanWalk();
        System.out.println(t.toString());
    }
}