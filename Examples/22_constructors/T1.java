class X {
    private X() {

    }

    X getInstance() {
        X a = new X();
        
        return a;   
    }
}

class A {
    public static void main(String[] args) {
        X r = new X();
        
        X y = r.getInstance();
    }
}