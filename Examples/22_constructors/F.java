class X {
    int y = 9;

    void pro() {

    }

    X() {
        System.out.println("X constructor");
    }
}

class Y extends X {
    float e = 2.3f;
    
    void info() {
        
    }

    Y() {
        System.out.println("Y Constructor");
    }
}

class A {
    public static void main(String[] args) {
        // X a = new X();

        Y w = new Y();
    }
}