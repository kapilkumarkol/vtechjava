class X {
    void pro() {
        System.out.println("pro in parent");
    }
}

class Y extends X {
    void pro() {
        System.out.println("pro in child");
    }
}

class A {
    public static void main(String[] args) {
        //polymorphic assignment
        X x = new Y();

        //polymorphic method invocation
        x.pro();
        //dynamic method dispatch
        //Runtime Polymorphism

        //Case 2:
        // Y x = new Y();
        // x.pro();

        //Case 1:
        // X x = new X();
        // x.pro();
    }
}