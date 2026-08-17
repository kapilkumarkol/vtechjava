class X {
    int w = 99;

    void info() {
        System.out.println("pro");
    }

    class Y {

    }
}

class A {
    void pro() {
        // System.out.println(w);
        // info();
        // Y y = new Y();        
    }
    public static void main(String[] args) {
        A a = new A();

        a.pro();
    }
}