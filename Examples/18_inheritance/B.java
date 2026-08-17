// Multi-level Inheritance 

class T {
    void info() {
        System.out.println("info in T");
    }
}

class X extends T {
    void process() {
        System.out.println("process in X");
    }
}

class Y extends X {
    public static void main(String[] args) {
        Y y = new Y();

        y.process();
        y.info();
    }
}