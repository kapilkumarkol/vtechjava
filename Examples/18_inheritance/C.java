// Multiple Inheritance

// But Java does not support MULTIPLE-CLASS inheritance...

class T {
    void info() {
        System.out.println("info in T");
    }
}

class X {
    void process() {
        System.out.println("process in X");
    }
}

class Y extends X, T {
    public static void main(String[] args) {
        Y y = new Y();

        y.process();
        y.info();
    }
}