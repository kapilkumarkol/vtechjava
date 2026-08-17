class A {    
    public static void main(String[] args) {
        A x = new A();    
    }

    void pro() {
        System.out.println("R");
    }

    {
        System.out.println("X");
    }

    A() {
        super();
        
        System.out.println("Y");
    }

    int r = 8;

    {
        System.out.println("B");
    }

    void info() {
        System.out.println("A");
    }

}