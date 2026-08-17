// Multiple Inheritance

interface T {
    void info();
}

class X {
    void process() {
        System.out.println("process in X");
    }
}

class Y extends X implements T {

    public void info() {
        System.out.println("info in Child class Y");
    }
    public static void main(String[] args) {
        Y y = new Y();

        y.process();
        y.info();
    }
}