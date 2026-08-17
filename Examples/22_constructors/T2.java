class X {
    private X() {

    }

    static X getInstance() {
        //essential code
        X a = new X();
        
        return a;   
    }
}

class A {
    public static void main(String[] args) {
               
        X y = X.getInstance();

        System.out.println(y);
    }
}