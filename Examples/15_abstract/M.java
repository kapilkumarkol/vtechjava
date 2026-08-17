abstract class X {
    abstract void process();

    abstract void info();
}

class A extends X {
    void info() {

    }
}

// error: A is not abstract and does not override abstract method process() in X