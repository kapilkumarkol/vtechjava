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
        X x = new X();
        System.out.println(x.w);
        x.info();
        
        // Y y = x.new Y();        
        //or
        X.Y y = x.new Y();        
    }
    public static void main(String[] args) {
        A a = new A();

        a.pro();
    }
}