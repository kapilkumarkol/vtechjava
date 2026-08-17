// Single Inheritance 

class X {
    void process() {
        System.out.println("process in X");
    }
}

class Y extends X {
    public static void main(String[] args) {
        Y y = new Y();

        y.process();
    }
}